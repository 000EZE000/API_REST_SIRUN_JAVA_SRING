package com.sirun.user.application;
import com.sirun.user.model.User;

public interface IUseCaseUser {

  User create(String name,String lastName,String password,String email,Integer age);
  User update(User user);
  void  delete(String email);  
}
