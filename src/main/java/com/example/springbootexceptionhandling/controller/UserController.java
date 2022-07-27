package com.example.springbootexceptionhandling.controller;


import com.example.springbootexceptionhandling.entity.User;
import com.example.springbootexceptionhandling.exception.UserNotFoundException;
import com.example.springbootexceptionhandling.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class UserController {


    @Autowired
    private UserService service;

    @PostMapping("/addUser")
    public void addUser(@RequestBody User user){
     service.addUser(user);
    }


     @GetMapping("/{id}")
    public User getUser(@PathVariable int id) throws UserNotFoundException {


         return service.getUser(id);
     }

}
