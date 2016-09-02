package com.github.hippo.demo.service.impl;

import com.github.hippo.annotation.HippoServiceImpl;
import com.github.hippo.demo.dto.TestRequest;
import com.github.hippo.demo.dto.TestResponse;
import com.github.hippo.demo.service.TestService;

@HippoServiceImpl(TestService.class)
public class TestServiceImpl implements TestService {

  @Override
  public TestResponse test(TestRequest request) {
    TestResponse response = new TestResponse();
    response.setResult(request.getId() + "," + request.getMsg() + ",success");
    return response;
  }

  @Override
  public String getUserName(String userId) {
    return "username:" + userId;
  }



}
