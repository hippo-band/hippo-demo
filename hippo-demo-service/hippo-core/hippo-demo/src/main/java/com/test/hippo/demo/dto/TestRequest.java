package com.test.hippo.demo.dto;

import java.io.Serializable;

public class TestRequest implements Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = 8493625139587036569L;
  private int id;
  private String msg;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getMsg() {
    return msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }

}
