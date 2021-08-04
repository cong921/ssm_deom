package com.example.ssm_demo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;


public class User {

  private long id;
  private String name;
  private String password;
  private int sex;
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
  @DateTimeFormat(pattern ="yyyy-MM-dd HH:mm:ss")
  private Date brithday;



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


  public int getSex() {
    return sex;
  }

  public void setSex(int sex) {
    this.sex = sex;
  }


  public Date getBrithday() {
    return brithday;
  }

  public void setBrithday(Date brithday) {
    this.brithday = brithday;
  }


  @Override
  public String toString() {
    return "User{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", password='" + password + '\'' +
            ", sex=" + sex +
            ", brithday=" + brithday +
            '}';
  }
}
