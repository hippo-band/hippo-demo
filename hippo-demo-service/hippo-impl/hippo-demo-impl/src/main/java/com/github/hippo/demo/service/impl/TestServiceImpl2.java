package com.github.hippo.demo.service.impl;

import com.github.hippo.annotation.HippoServiceImpl;
import com.github.hippo.demo.service.TestService2;

@HippoServiceImpl(TestService2.class)
public class TestServiceImpl2 implements TestService2 {

  @Override
  public String getUserName2() {
    return "sl";
  }



}
