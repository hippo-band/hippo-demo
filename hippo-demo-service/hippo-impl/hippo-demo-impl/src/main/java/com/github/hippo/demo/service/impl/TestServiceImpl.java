package com.github.hippo.demo.service.impl;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import com.github.hippo.annotation.HippoClient;
import com.github.hippo.annotation.HippoServiceImpl;
import com.github.hippo.demo.dto.TestRequest;
import com.github.hippo.demo.dto.TestResponse;
import com.github.hippo.demo.service.TestService;
import com.github.hippo.demo.service.TestService2;

@HippoServiceImpl()
public class TestServiceImpl implements TestService {
  @HippoClient
  private TestService2 testService2;

  @Override
  public TestResponse test(TestRequest request) {
    TestResponse response = new TestResponse();
    try {
      response.setResult(
          request.getId() + "," + request.getMsg() + ",success" + testService2.getUserName2());
    } catch (Exception e) {
      System.out.println(">>>>>>>>>>" + e);
    }
    return response;
  }

  @Override
  public void getUserName(InputStream inputStream) {
    try {
      byte[] b = new byte[1024];
      inputStream.read(b);
      System.out.println(">>>>>>>" + new String(b));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  @Override
  public String ping(String username) {
    return username;
  }

  @Override
  public String ping1(String username) {
    return username;
  }

  @Override
  public String ping2(String uname, List<Integer> list) {
    for (Integer integer : list) {
      System.out.println(integer);
    }
    return "ping2";
  }



}
