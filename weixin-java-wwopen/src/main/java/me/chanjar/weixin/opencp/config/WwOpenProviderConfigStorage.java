package me.chanjar.weixin.opencp.config;

import me.chanjar.weixin.common.bean.WxAccessToken;
import me.chanjar.weixin.common.util.http.apache.ApacheHttpClientBuilder;

import java.util.concurrent.locks.Lock;

public interface WwOpenProviderConfigStorage {
  String getCorpId();

  String getProviderSecret();

  String getToken();

  String getAesKey();


  String getProviderAccessToken();

  boolean isProviderAccessTokenExpired();

  /**
   * 强制将provider_access_token过期掉.
   */
  void expireProviderAccessToken();

  void updateProviderAccessToken(WxAccessToken providerAccessToken);

  void updateProviderAccessToken(String providerAccessToken, int expiresIn);

  /**
   * 是否自动刷新token
   * @return .
   */
  boolean autoRefreshToken();

  Lock getProviderAccessTokenLock();


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
