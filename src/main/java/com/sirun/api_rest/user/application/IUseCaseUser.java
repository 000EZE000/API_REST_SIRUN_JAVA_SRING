package com.sirun.api_rest.user.application;

import com.sirun.api_rest.user.model.User;

public interface IUseCaseUser {

  User create(User user);
  User update(User user);
  void delete(String email);  
  User findByEmail(String email);
}
