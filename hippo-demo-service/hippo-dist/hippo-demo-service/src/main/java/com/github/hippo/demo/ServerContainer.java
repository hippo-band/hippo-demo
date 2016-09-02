package com.github.hippo.demo;

import java.io.IOException;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ServerContainer {

  @SuppressWarnings("resource")
  public static void main(String[] args) throws IOException {
    new FileSystemXmlApplicationContext("classpath:application-context.xml");
  }
}
