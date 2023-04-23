package com.sirun.api_rest.user.infractucture.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sirun.api_rest.user.application.IUseCaseUser;
import com.sirun.api_rest.user.infractucture.repositories.RepositoryUser;
import com.sirun.api_rest.user.model.User;
import com.sirun.api_rest.utils.validator.CheckInyectSQL;
import com.sirun.api_rest.utils.validator.CheckUserData;

@Service
public class ServicesUser implements IUseCaseUser{
  
  @Autowired
  RepositoryUser repositoryUser;

  @Override
  public User createUser(User user) throws IllegalArgumentException  {

    if(
        CheckUserData.isNull(user) ||
        CheckUserData.isPropertiesNull(user) ||
        CheckInyectSQL.isInyectSQL(user)
        ) throw new IllegalArgumentException("the data for the creation of the User is incorrect");

    repositoryUser.createUser(user);
    return user;   
  }
  
  @Override
  public User findUserByEmail(String email) {
    if(email == null && email instanceof String)
      throw new IllegalArgumentException("email must exist");
      
    return repositoryUser.findUserByEmail(email);
  }

  @Override
  public User updateUser(User user) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'updateUser'");
  }

  @Override
  public void deleteUser(String email) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'deleteUser'");
  }

  
}
