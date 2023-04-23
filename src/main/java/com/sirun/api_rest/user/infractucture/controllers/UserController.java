package com.sirun.api_rest.user.infractucture.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sirun.api_rest.user.infractucture.services.ServicesUser;
import com.sirun.api_rest.user.model.User;

@RestController
@RequestMapping(value = "api/user/")
@CrossOrigin("*")
public class UserController {

  @Autowired
  ServicesUser servicesUser;
  
  @PostMapping("sign_up")
  public ResponseEntity<String> SignUP(@RequestBody User request){
    try {
      servicesUser.createUser(request);
    } catch(IllegalArgumentException error){
      return new ResponseEntity<String>(error.getMessage(), HttpStatus.BAD_REQUEST);
    }
    return new ResponseEntity<String>("the user has successfully registered", HttpStatus.CREATED);
  } 
}
