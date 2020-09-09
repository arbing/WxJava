package me.chanjar.weixin.opencp.config;

import me.chanjar.weixin.common.bean.WxAccessToken;
import me.chanjar.weixin.common.util.http.apache.ApacheHttpClientBuilder;
import me.chanjar.weixin.cp.config.WxCpConfigStorage;

import java.util.concurrent.locks.Lock;

public interface WwOpenSuiteConfigStorage {

  String getSuiteId();

  String getSuiteSecret();

  String getToken();

  String getAesKey();


  String getSuiteTicket();

  boolean isSuiteTicketExpired();

  /**
   * 强制将suite ticket过期掉.
   */
  void expireSuiteTicket();

  /**
   * 应该是线程安全的.
   */
  void updateSuiteTicket(String suiteTicket, int expiresInSeconds);


  String getSuiteAccessToken();

  boolean isSuiteAccessTokenExpired();

  /**
   * 强制将suite_access_token过期掉.
   */
  void expireSuiteAccessToken();

  void updateSuiteAccessToken(WxAccessToken suiteAccessToken);

  void updateSuiteAccessToken(String suiteAccessToken, int expiresIn);

  /**
   * 是否自动刷新token
   * @return .
   */
  boolean autoRefreshToken();

  Lock getSuiteAccessTokenLock();

  Lock getLockByKey(String key);


  WxCpConfigStorage getWxCpConfigStorage(String authCorpId);


  /**
   * Gets http proxy host.
   *
   * @return the http proxy host
   */
  String getHttpProxyHost();

  /**
   * Gets http proxy port.
   *
   * @return the http proxy port
   */
  int getHttpProxyPort();

  /**
   * Gets http proxy username.
   *
   * @return the http proxy username
   */
  String getHttpProxyUsername();

  /**
   * Gets http proxy password.
   *
   * @return the http proxy password
   */
  String getHttpProxyPassword();

  /**
   * Gets apache http client builder.
   *
   * @return the apache http client builder
   */
  ApacheHttpClientBuilder getApacheHttpClientBuilder();
}
