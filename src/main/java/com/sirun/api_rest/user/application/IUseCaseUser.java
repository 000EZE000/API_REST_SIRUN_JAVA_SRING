package com.sirun.api_rest.user.application;

import com.sirun.api_rest.user.model.User;

public interface IUseCaseUser {

  User createUser(User user);
  User updateUser(User user);
  void deleteUser(String email);  
  User findUserByEmail(String email);
}
