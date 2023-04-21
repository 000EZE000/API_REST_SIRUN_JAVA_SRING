package com.sirun.api_rest.user.infractucture.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sirun.api_rest.user.model.User;

@RestController
@RequestMapping(value = "api/user/")
@CrossOrigin("*")
public class UserController {

  @PostMapping("sign_up")
  public User SignUP(@RequestBody User request){
    return request;
  } 
  
}
