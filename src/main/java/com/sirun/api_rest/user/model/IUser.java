package com.sirun.api_rest.user.model;


public interface IUser {

  String getName();
  String getLastName();
  String getEmail();
  String getPassword();
  String getPhoto();
  Roles getRol();


  void setName(String name);
  void setLastName(String lastName);
  void setEmail(String email);
  void setPassword(String password);
  void setPhoto(String photo);
  
}
