package com.sirun.api_rest.user.validation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.sirun.api_rest.user.UserForTest;
import com.sirun.api_rest.user.model.User;
import com.sirun.api_rest.utils.validator.CheckUserData;

@SpringBootTest
public class UserDataTest {

@Test
  void checkIsNull(){
     assertEquals(true, CheckUserData.isNull(null));
  }

@Test
  void checkUserPropertyEmpty(){
    User userEmpty = UserForTest.getUserEmpty() ;
   assertEquals(true, CheckUserData.isPropertiesNull(userEmpty));
  }

@Test
  void checkUserProperty(){
    User userNormal = UserForTest.getUserComplety();
   assertEquals(false, CheckUserData.isPropertiesNull(userNormal));
  }
}
