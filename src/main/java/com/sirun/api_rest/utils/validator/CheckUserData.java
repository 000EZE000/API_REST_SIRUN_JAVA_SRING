package com.sirun.api_rest.utils.validator;

import com.sirun.api_rest.user.model.User;

public class CheckUserData {

  public static boolean isNull(User user){
    return user == null;
  }

  public static boolean isPropertiesNull(User user){
    return isPropertyNull(user.getName()) ||
      isPropertyNull(user.getLastName()) ||
      isPropertyNull(user.getEmail()) ||
      isPropertyNull(user.getPassword());
  } 

  private static boolean isPropertyNull(String property){
    return property == null;
  }
}
