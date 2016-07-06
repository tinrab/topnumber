/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/google/apis-client-generator/
 * (build: 2016-05-27 16:00:31 UTC)
 * on 2016-07-06 at 17:41:17 UTC 
 * Modify at your own risk.
 */

package com.moybl.topnumber.backend.topNumber;

/**
 * Service definition for TopNumber (v1).
 *
 * <p>
 * Number getting bigger.
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link TopNumberRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class TopNumber extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.22.0 of the topNumber library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://top-number-4242.appspot.com/_ah/api/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "topNumber/v1/";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public TopNumber(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  TopNumber(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * An accessor for creating requests from the Numbers collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code TopNumber topNumber = new TopNumber(...);}
   *   {@code TopNumber.Numbers.List request = topNumber.numbers().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public Numbers numbers() {
    return new Numbers();
  }

  /**
   * The "numbers" collection of methods.
   */
  public class Numbers {

    /**
     * Create a request for the method "numbers.insert".
     *
     * This request holds the parameters needed by the topNumber server.  After setting any optional
     * parameters, call the {@link Insert#execute()} method to invoke the remote operation.
     *
     * @param number
     * @return the request
     */
    public Insert insert(java.lang.Double number) throws java.io.IOException {
      Insert result = new Insert(number);
      initialize(result);
      return result;
    }

    public class Insert extends TopNumberRequest<Void> {

      private static final String REST_PATH = "void/{number}";

      /**
       * Create a request for the method "numbers.insert".
       *
       * This request holds the parameters needed by the the topNumber server.  After setting any
       * optional parameters, call the {@link Insert#execute()} method to invoke the remote operation.
       * <p> {@link
       * Insert#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
       * be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param number
       * @since 1.13
       */
      protected Insert(java.lang.Double number) {
        super(TopNumber.this, "POST", REST_PATH, null, Void.class);
        this.number = com.google.api.client.util.Preconditions.checkNotNull(number, "Required parameter number must be specified.");
      }

      @Override
      public Insert setAlt(java.lang.String alt) {
        return (Insert) super.setAlt(alt);
      }

      @Override
      public Insert setFields(java.lang.String fields) {
        return (Insert) super.setFields(fields);
      }

      @Override
      public Insert setKey(java.lang.String key) {
        return (Insert) super.setKey(key);
      }

      @Override
      public Insert setOauthToken(java.lang.String oauthToken) {
        return (Insert) super.setOauthToken(oauthToken);
      }

      @Override
      public Insert setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (Insert) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public Insert setQuotaUser(java.lang.String quotaUser) {
        return (Insert) super.setQuotaUser(quotaUser);
      }

      @Override
      public Insert setUserIp(java.lang.String userIp) {
        return (Insert) super.setUserIp(userIp);
      }

      @com.google.api.client.util.Key
      private java.lang.Double number;

      /**

       */
      public java.lang.Double getNumber() {
        return number;
      }

      public Insert setNumber(java.lang.Double number) {
        this.number = number;
        return this;
      }

      @Override
      public Insert set(String parameterName, Object value) {
        return (Insert) super.set(parameterName, value);
      }
    }
    /**
     * Create a request for the method "numbers.listTop".
     *
     * This request holds the parameters needed by the topNumber server.  After setting any optional
     * parameters, call the {@link ListTop#execute()} method to invoke the remote operation.
     *
     * @return the request
     */
    public ListTop listTop() throws java.io.IOException {
      ListTop result = new ListTop();
      initialize(result);
      return result;
    }

    public class ListTop extends TopNumberRequest<com.moybl.topnumber.backend.topNumber.model.CollectionResponsePlayer> {

      private static final String REST_PATH = "player";

      /**
       * Create a request for the method "numbers.listTop".
       *
       * This request holds the parameters needed by the the topNumber server.  After setting any
       * optional parameters, call the {@link ListTop#execute()} method to invoke the remote operation.
       * <p> {@link
       * ListTop#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
       * be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @since 1.13
       */
      protected ListTop() {
        super(TopNumber.this, "GET", REST_PATH, null, com.moybl.topnumber.backend.topNumber.model.CollectionResponsePlayer.class);
      }

      @Override
      public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
        return super.executeUsingHead();
      }

      @Override
      public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
        return super.buildHttpRequestUsingHead();
      }

      @Override
      public ListTop setAlt(java.lang.String alt) {
        return (ListTop) super.setAlt(alt);
      }

      @Override
      public ListTop setFields(java.lang.String fields) {
        return (ListTop) super.setFields(fields);
      }

      @Override
      public ListTop setKey(java.lang.String key) {
        return (ListTop) super.setKey(key);
      }

      @Override
      public ListTop setOauthToken(java.lang.String oauthToken) {
        return (ListTop) super.setOauthToken(oauthToken);
      }

      @Override
      public ListTop setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (ListTop) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public ListTop setQuotaUser(java.lang.String quotaUser) {
        return (ListTop) super.setQuotaUser(quotaUser);
      }

      @Override
      public ListTop setUserIp(java.lang.String userIp) {
        return (ListTop) super.setUserIp(userIp);
      }

      @com.google.api.client.util.Key
      private java.lang.String cursor;

      /**

       */
      public java.lang.String getCursor() {
        return cursor;
      }

      public ListTop setCursor(java.lang.String cursor) {
        this.cursor = cursor;
        return this;
      }

      @Override
      public ListTop set(String parameterName, Object value) {
        return (ListTop) super.set(parameterName, value);
      }
    }

  }

  /**
   * An accessor for creating requests from the Players collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code TopNumber topNumber = new TopNumber(...);}
   *   {@code TopNumber.Players.List request = topNumber.players().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public Players players() {
    return new Players();
  }

  /**
   * The "players" collection of methods.
   */
  public class Players {

    /**
     * Create a request for the method "players.insertTestPlayers".
     *
     * This request holds the parameters needed by the topNumber server.  After setting any optional
     * parameters, call the {@link InsertTestPlayers#execute()} method to invoke the remote operation.
     *
     * @return the request
     */
    public InsertTestPlayers insertTestPlayers() throws java.io.IOException {
      InsertTestPlayers result = new InsertTestPlayers();
      initialize(result);
      return result;
    }

    public class InsertTestPlayers extends TopNumberRequest<Void> {

      private static final String REST_PATH = "void";

      /**
       * Create a request for the method "players.insertTestPlayers".
       *
       * This request holds the parameters needed by the the topNumber server.  After setting any
       * optional parameters, call the {@link InsertTestPlayers#execute()} method to invoke the remote
       * operation. <p> {@link InsertTestPlayers#initialize(com.google.api.client.googleapis.services.Ab
       * stractGoogleClientRequest)} must be called to initialize this instance immediately after
       * invoking the constructor. </p>
       *
       * @since 1.13
       */
      protected InsertTestPlayers() {
        super(TopNumber.this, "POST", REST_PATH, null, Void.class);
      }

      @Override
      public InsertTestPlayers setAlt(java.lang.String alt) {
        return (InsertTestPlayers) super.setAlt(alt);
      }

      @Override
      public InsertTestPlayers setFields(java.lang.String fields) {
        return (InsertTestPlayers) super.setFields(fields);
      }

      @Override
      public InsertTestPlayers setKey(java.lang.String key) {
        return (InsertTestPlayers) super.setKey(key);
      }

      @Override
      public InsertTestPlayers setOauthToken(java.lang.String oauthToken) {
        return (InsertTestPlayers) super.setOauthToken(oauthToken);
      }

      @Override
      public InsertTestPlayers setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (InsertTestPlayers) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public InsertTestPlayers setQuotaUser(java.lang.String quotaUser) {
        return (InsertTestPlayers) super.setQuotaUser(quotaUser);
      }

      @Override
      public InsertTestPlayers setUserIp(java.lang.String userIp) {
        return (InsertTestPlayers) super.setUserIp(userIp);
      }

      @Override
      public InsertTestPlayers set(String parameterName, Object value) {
        return (InsertTestPlayers) super.set(parameterName, value);
      }
    }
    /**
     * Create a request for the method "players.logInWithFacebook".
     *
     * This request holds the parameters needed by the topNumber server.  After setting any optional
     * parameters, call the {@link LogInWithFacebook#execute()} method to invoke the remote operation.
     *
     * @return the request
     */
    public LogInWithFacebook logInWithFacebook() throws java.io.IOException {
      LogInWithFacebook result = new LogInWithFacebook();
      initialize(result);
      return result;
    }

    public class LogInWithFacebook extends TopNumberRequest<com.moybl.topnumber.backend.topNumber.model.Player> {

      private static final String REST_PATH = "logInWithFacebook";

      /**
       * Create a request for the method "players.logInWithFacebook".
       *
       * This request holds the parameters needed by the the topNumber server.  After setting any
       * optional parameters, call the {@link LogInWithFacebook#execute()} method to invoke the remote
       * operation. <p> {@link LogInWithFacebook#initialize(com.google.api.client.googleapis.services.Ab
       * stractGoogleClientRequest)} must be called to initialize this instance immediately after
       * invoking the constructor. </p>
       *
       * @since 1.13
       */
      protected LogInWithFacebook() {
        super(TopNumber.this, "POST", REST_PATH, null, com.moybl.topnumber.backend.topNumber.model.Player.class);
      }

      @Override
      public LogInWithFacebook setAlt(java.lang.String alt) {
        return (LogInWithFacebook) super.setAlt(alt);
      }

      @Override
      public LogInWithFacebook setFields(java.lang.String fields) {
        return (LogInWithFacebook) super.setFields(fields);
      }

      @Override
      public LogInWithFacebook setKey(java.lang.String key) {
        return (LogInWithFacebook) super.setKey(key);
      }

      @Override
      public LogInWithFacebook setOauthToken(java.lang.String oauthToken) {
        return (LogInWithFacebook) super.setOauthToken(oauthToken);
      }

      @Override
      public LogInWithFacebook setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (LogInWithFacebook) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public LogInWithFacebook setQuotaUser(java.lang.String quotaUser) {
        return (LogInWithFacebook) super.setQuotaUser(quotaUser);
      }

      @Override
      public LogInWithFacebook setUserIp(java.lang.String userIp) {
        return (LogInWithFacebook) super.setUserIp(userIp);
      }

      @com.google.api.client.util.Key
      private java.lang.Boolean reset;

      /**

       */
      public java.lang.Boolean getReset() {
        return reset;
      }

      public LogInWithFacebook setReset(java.lang.Boolean reset) {
        this.reset = reset;
        return this;
      }

      @Override
      public LogInWithFacebook set(String parameterName, Object value) {
        return (LogInWithFacebook) super.set(parameterName, value);
      }
    }

  }

  /**
   * Builder for {@link TopNumber}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          DEFAULT_ROOT_URL,
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
    }

    /** Builds a new instance of {@link TopNumber}. */
    @Override
    public TopNumber build() {
      return new TopNumber(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link TopNumberRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setTopNumberRequestInitializer(
        TopNumberRequestInitializer topnumberRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(topnumberRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
