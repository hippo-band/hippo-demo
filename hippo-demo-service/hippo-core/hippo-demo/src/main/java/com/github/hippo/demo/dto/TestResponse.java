package com.github.hippo.demo.dto;

import java.io.Serializable;

public class TestResponse implements Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = -9087479700370276156L;
  private String result;

  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }

}
