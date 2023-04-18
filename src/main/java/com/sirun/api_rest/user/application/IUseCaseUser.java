package com.sirun.api_rest.user.application;

import com.sirun.api_rest.user.model.User;

public interface IUseCaseUser {

  User create(String name,String lastName,String password,String email,Integer age);
  User update(User user);
  void  delete(String email);  
}
