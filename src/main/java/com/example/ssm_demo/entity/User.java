package com.example.ssm_demo.entity;

import java.sql.Date;

public class User {

  private long id;
  private String name;
  private String password;
  private long sex;
  private java.sql.Date brithday;



  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public long getSex() {
    return sex;
  }

  public void setSex(long sex) {
    this.sex = sex;
  }


  public java.sql.Date getBrithday() {
    return brithday;
  }

  public void setBrithday(java.sql.Date brithday) {
    this.brithday = brithday;
  }

  public User(long id, String name, String password, long sex, Date brithday) {
    this.id = id;
    this.name = name;
    this.password = password;
    this.sex = sex;
    this.brithday = brithday;
  }
}
