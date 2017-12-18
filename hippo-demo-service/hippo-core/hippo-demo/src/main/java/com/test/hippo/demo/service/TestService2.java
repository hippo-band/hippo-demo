package com.test.hippo.demo.service;

import com.github.hippo.annotation.HippoService;


/**
 * @author TestService服务接口
 * 
 */
@HippoService(serviceName = "hippo.demo.service")
public interface TestService2 {


  public String getUserName2();
}
