package com.sirun.api_rest.user.model;

import java.util.UUID;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class User implements IUser {
  @Getter 
  private String id = UUID.randomUUID().toString();
  @Getter @Setter
  private String name;
  @Getter @Setter
  private String lastName;
  @Getter 
  private String email;
  @Getter @Setter
  private String password;
  @Getter @Setter
  private String photo = GetPhotoDefault.get();
  @Getter
  private Roles rol = Roles.CLIENT;

  public User(String name, String lastName, String email, String password) {
    this.name = name;
    this.lastName = lastName;
    this.email = email;
    this.password = password;
  }
  
  public User(){}

  public User(String id,String email,String photo,Roles rol ,String name, String lastName, String password) {
    this.id = id;
    this.name = name;
    this.lastName = lastName;
    this.email = email;
    this.password = password;
    this.rol = rol;
    this.photo = photo;
  }  
}
