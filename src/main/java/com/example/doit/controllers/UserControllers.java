package com.example.doit.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.doit.domains.UserDto;
import com.example.doit.impls.UserServiceImpl;
import com.example.doit.services.UerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class UserControllers {
  @Autowired UerService userService;
    @PostMapping("/users")
    public Map<String, String> join(@RequestBody UserDto user){
      System.out.println("========Join========");
      Map<String, String> map = new HashMap<>();
      System.out.println("아이디: "+user.getUserid());
      System.out.println("비번: "+user.getPassword());
      System.out.println("이름: "+user.getName());
      int result = userService.join(user);
      if(result == 1){
          map.put("name", user.getName());
      }else{
          map.put("name", "FAILURE");
      }
      map.put("name", user.getName());
      return map;  
    }
    @PostMapping("/users/login")
    public Map<String, String> login(@RequestBody UserDto user){
        System.out.println("=========== Login ===========");
        Map<String, String> map = new HashMap<>();
        UserDto result = userService.login(user);
        if(result == null){
          map.put("name", result.getName());
        }else{
          map.put("name", "FAILURE");
        }
      
        return map;
    }
}
