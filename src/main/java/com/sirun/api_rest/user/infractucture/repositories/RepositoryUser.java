package com.sirun.api_rest.user.infractucture.repositories;

import com.sirun.api_rest.user.application.IUseCaseUser;
import com.sirun.api_rest.user.model.User;

/**
 * RepositoryUser
 */
public class RepositoryUser implements IUseCaseUser{

  @Override
  public User create(User user) {
    return user;
  }

  @Override
  public User update(User user) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'update'");
  }

  @Override
  public void delete(String email) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'delete'");
  }

  
}
