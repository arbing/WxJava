package me.chanjar.weixin.opencp.api;

import me.chanjar.weixin.opencp.config.WwOpenProviderConfigStorage;

public interface WwOpenProviderService {
  WwOpenProviderConfigStorage getWwOpenProviderConfigStorage();

  void setWwOpenProviderConfigStorage(WwOpenProviderConfigStorage wwOpenProviderConfigStorage);


}
