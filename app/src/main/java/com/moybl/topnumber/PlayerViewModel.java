package com.moybl.topnumber;

import android.support.v7.widget.RecyclerView;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.moybl.topnumber.backend.PlayerModel;
import com.squareup.picasso.Picasso;

public class PlayerViewModel extends RecyclerView.ViewHolder {

	public PlayerViewModel(View itemView) {
		super(itemView);
	}

	public void setPlayer(PlayerModel player) {
		ImageView picture = (ImageView) itemView.findViewById(R.id.img_player_picture);
		TextView nameTextView = (TextView) itemView.findViewById(R.id.tv_player_name);
		TextView numberTextView = (TextView) itemView.findViewById(R.id.tv_player_number);
		TextView numberNameTextView = (TextView) itemView.findViewById(R.id.tv_player_number_name);
		TextView orderTextView = (TextView) itemView.findViewById(R.id.tv_player_order);

		if (!player.isSilhouette()) {
			Picasso.with(itemView.getContext())
					.load(String.format("https://graph.facebook.com/%s/picture?type=square", player.getId()))
					.placeholder(R.drawable.com_facebook_profile_picture_blank_square)
					.into(picture);
		}

		String orderText = NumberUtil.format(player.getOrder());
		orderTextView.setText(orderText);
		int ts = 18;

		if (orderText.length() > 3) {
			int o = orderText.length() - 3;
			ts -= 2 * o;
		}

		orderTextView.setTextSize(TypedValue.COMPLEX_UNIT_DIP, ts);

		nameTextView.setText(player.getName());
		numberTextView.setText(NumberUtil.format(NumberUtil.firstDigits(player.getNumber())));

		if (NumberUtil.powerOf(player.getNumber()) >= 3) {
			Util.setVisible(numberNameTextView);

			numberNameTextView.setText(NumberUtil.powerName(player.getNumber()));
		} else {
			Util.setGone(numberNameTextView);
		}
	}

}