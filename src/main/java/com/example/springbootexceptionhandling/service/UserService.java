package com.example.springbootexceptionhandling.service;


import com.example.springbootexceptionhandling.entity.User;
import com.example.springbootexceptionhandling.exception.UserNotFoundException;
import com.example.springbootexceptionhandling.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepo repository;


       public void addUser(User user){
           repository.save(user);


       }

       public User getUser(int  userId) throws UserNotFoundException {
         User user=repository.findByUserId(userId);
          if(user==null){
             throw new UserNotFoundException("User not found with id "+userId);
          }
          else {
              return user ;
          }

       }
}
