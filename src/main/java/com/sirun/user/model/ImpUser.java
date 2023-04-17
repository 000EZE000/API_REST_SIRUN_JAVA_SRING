package com.sirun.user.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
class ImpUser  implements User{
  @Getter @Setter
  private String name;
  @Getter @Setter
  private String lastName;
  @Getter @Setter
  private String email;
  @Getter @Setter
  private String password;
  @Getter @Setter
  private Integer age;
  @Getter @Setter
  private String photo = GetPhotoDefault.get();
  @Getter
  private Roles  rol = Roles.CLIENT;

  public ImpUser(String name, String lastName, String email, String password, Integer age) {
    this.name = name;
    this.lastName = lastName;
    this.email = email;
    this.password = password;
    this.age = age;
  }

  
}
