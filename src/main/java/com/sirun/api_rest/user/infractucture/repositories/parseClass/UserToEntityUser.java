package com.sirun.api_rest.user.infractucture.repositories.parseClass;

import com.sirun.api_rest.user.infractucture.repositories.entities.EntityUser;
import com.sirun.api_rest.user.model.User;

public class UserToEntityUser {

 public static EntityUser toEntityUser(User user){
    return new EntityUser(
      user.getId(),
      user.getEmail(),
      user.getPhoto(),
      user.getRol(),
      user.getName(),
      user.getLastName(),
      user.getPassword()
    );
  } 
}
