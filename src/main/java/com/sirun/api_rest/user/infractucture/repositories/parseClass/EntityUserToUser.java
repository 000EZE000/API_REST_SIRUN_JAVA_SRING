package com.sirun.api_rest.user.infractucture.repositories.parseClass;

import com.sirun.api_rest.user.infractucture.repositories.entities.EntityUser;
import com.sirun.api_rest.user.model.User;

public class EntityUserToUser {

 public static User toUser(EntityUser entityUser){
    return new User(
      entityUser.getId(),
      entityUser.getEmail(),
      entityUser.getPhoto(),
      entityUser.getRol(),
      entityUser.getName(),
      entityUser.getLastName(),
      entityUser.getPassword()
    );
  } 
}
