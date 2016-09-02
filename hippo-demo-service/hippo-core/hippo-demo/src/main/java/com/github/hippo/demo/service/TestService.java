package com.github.hippo.demo.service;

import com.github.hippo.annotation.HippoService;
import com.github.hippo.demo.dto.TestRequest;
import com.github.hippo.demo.dto.TestResponse;


/**
 * @author TestService服务接口
 * 
 */
@HippoService(serviceName = "hippo.demo.service")
public interface TestService {

  public TestResponse test(TestRequest request);

  public String getUserName(String userId);
}
