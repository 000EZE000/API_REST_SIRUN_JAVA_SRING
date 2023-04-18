package com.sirun.api_rest.user.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class User implements IUser {
  @Getter @Setter
  private String name;
  @Getter @Setter
  private String lastName;
  @Getter @Setter
  private String email;
  @Getter @Setter
  private String password;
  @Getter @Setter
  private String photo = GetPhotoDefault.get();
  @Getter
  private Roles  rol = Roles.CLIENT;

  public User(String name, String lastName, String email, String password) {
    this.name = name;
    this.lastName = lastName;
    this.email = email;
    this.password = password;
  }
public User(){}


}
