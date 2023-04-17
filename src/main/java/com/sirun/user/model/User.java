package com.sirun.user.model;


public interface User {

  String getName();
  String getLastName();
  String getEmail();
  String getPassword();
  String getPhoto();
  Integer getAge();
  Roles getRol();


  void setName(String name);
  void setLastName(String lastName);
  void setEmail(String email);
  void setPassword(String password);
  void setPhoto(String photo);
  void setAge(Integer age);
  
}
