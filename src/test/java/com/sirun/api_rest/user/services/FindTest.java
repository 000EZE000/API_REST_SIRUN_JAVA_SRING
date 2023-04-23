package com.sirun.api_rest.user.services;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sirun.api_rest.user.UserForTest;
import com.sirun.api_rest.user.infractucture.services.ServicesUser;
import com.sirun.api_rest.user.model.User;

@SpringBootTest
public class FindTest {

  @Autowired
  ServicesUser servicesUser;

  @Test
  public void CheckFind(){
    User user = UserForTest.getUserComplety();
    final String EMAIL = user.getEmail(); 
    User userDatabase = servicesUser.findUserByEmail(user.getEmail());
    boolean result = EMAIL.equals(userDatabase.getEmail());
    assertEquals(true, result);
  }
}
