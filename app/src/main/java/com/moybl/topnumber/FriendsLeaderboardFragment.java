package com.moybl.topnumber;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.facebook.share.model.AppInviteContent;
import com.facebook.share.widget.AppInviteDialog;
import com.moybl.topnumber.backend.ListFriendsResult;
import com.moybl.topnumber.backend.ResultCallback;
import com.moybl.topnumber.backend.TopNumberClient;

public class FriendsLeaderboardFragment extends Fragment {

	private RecyclerView mFriendsRecycler;
	private PlayersAdapter mFriendsAdapter;
	private TopNumberClient mClient;
	private LinearLayoutManager mLayoutManager;
	private View mLoadingIndicator;

	@Override
	public void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	private void loadNextPage() {
		mLoadingIndicator.setVisibility(View.VISIBLE);

		mClient.listFriends(new ResultCallback<ListFriendsResult>() {
			@Override
			public void onResult(@NonNull ListFriendsResult result) {
				mLoadingIndicator.setVisibility(View.GONE);

				if (!result.isSuccess()) {
					return;
				}

				mFriendsAdapter.getPlayers()
						.addAll(result.getFriends());
				mFriendsAdapter.notifyDataSetChanged();
			}
		});
	}

	@Override
	public void onStart() {
		super.onStart();

		loadNextPage();
	}

	@Nullable
	@Override
	public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.fragment_friends_leaderboard, container, false);
		mFriendsRecycler = (RecyclerView) v.findViewById(R.id.friends_recycler);
		mLoadingIndicator = v.findViewById(R.id.loading_indicator);

		mLayoutManager = new LinearLayoutManager(getActivity());
		mFriendsAdapter = new PlayersAdapter(getActivity());

		mFriendsRecycler.setLayoutManager(mLayoutManager);
		mFriendsRecycler.addItemDecoration(new VerticalSpaceItemDecoration(10));
		mFriendsRecycler.setAdapter(mFriendsAdapter);
		mFriendsRecycler.addOnScrollListener(new RecyclerView.OnScrollListener() {
			@Override
			public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
				super.onScrollStateChanged(recyclerView, newState);
			}

			@Override
			public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
				if (dy > 0) {
					int childCount = mLayoutManager.getChildCount();
					int totalCount = mLayoutManager.getItemCount();
					int firstVisible = mLayoutManager.findFirstVisibleItemPosition();

					if ((childCount + firstVisible) >= totalCount) {
						loadNextPage();
					}
				}
			}
		});

		mClient = TopNumberClient.getInstance();

		v.findViewById(R.id.btn_invite_friends)
				.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						String appLinkUrl, previewImageUrl;

						appLinkUrl = "https://www.mydomain.com/myapplink";
						previewImageUrl = "https://www.mydomain.com/my_invite_image.jpg";

						if (AppInviteDialog.canShow()) {
							AppInviteContent content = new AppInviteContent.Builder()
									.setApplinkUrl(appLinkUrl)
									.setPreviewImageUrl(previewImageUrl)
									.build();
							AppInviteDialog.show(getActivity(), content);
						}
					}
				});

		return v;
	}

}