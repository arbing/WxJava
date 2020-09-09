package me.chanjar.weixin.opencp.api;

import me.chanjar.weixin.opencp.config.WwOpenSuiteConfigStorage;

public interface WwOpenSuiteService {
  WwOpenSuiteConfigStorage getWwOpenSuiteConfigStorage();

  void setWwOpenSuiteConfigStorage(WwOpenSuiteConfigStorage wwOpenSuiteConfigStorage);

}
