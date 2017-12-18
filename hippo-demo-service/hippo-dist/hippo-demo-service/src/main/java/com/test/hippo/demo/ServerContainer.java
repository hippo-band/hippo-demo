package com.test.hippo.demo;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ServerContainer {

  @SuppressWarnings("resource")
  public static void main(String[] args){
    new FileSystemXmlApplicationContext("classpath:application-context.xml");
  }
}
