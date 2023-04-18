package com.sirun.api_rest.user.infractucture.services;

import org.springframework.stereotype.Service;

import com.sirun.api_rest.user.application.IUseCaseUser;
import com.sirun.api_rest.user.model.User;

@Service
public class ServicesUser implements IUseCaseUser{

  @Override
  public User create(User user) {
    //if user exist?
    //data verification 
    //inyect SQL
    return user ;   
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
