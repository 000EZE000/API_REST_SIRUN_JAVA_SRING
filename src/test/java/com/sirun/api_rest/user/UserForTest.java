package com.sirun.api_rest.user;

import com.sirun.api_rest.user.model.User;

public class UserForTest {

 public static User getUserComplety(){
   return new User("ezequiel", "sosa", "ezequiel@gmail.com", "password");
  } 

  public static User getUserEmpty(){
    return new User(null,null,null,null);
  }

  public static User userCustom(String name,String lastName,String email, String password){
    return new User(name, lastName, email, password);
  }
}
