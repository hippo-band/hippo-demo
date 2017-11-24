package com.github.hippo.demo.service;

import java.io.InputStream;
import java.util.List;

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
  
  public String ping(String username);
  
  public String ping1(String username);
  
  public String ping2(String uname,List<Integer>list);

  public void getUserName(InputStream inputStream);
}
