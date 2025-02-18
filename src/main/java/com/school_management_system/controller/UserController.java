/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.school_management_system.controller;

import com.school_management_system.model.User;
import com.school_management_system.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Kasim Lyee
 */

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "https://localhost:5173")
public class UserController {
    
    @Autowired
    public UserService userService;
    
   @PostMapping
   public User createUser(@RequestBody User user){
       return userService.saveUser(user);
   }
   @GetMapping("/users")
   public ResponseEntity<List<User>>getAllUsers(){
       List<User> users = userService.getAllUsers();
       return ResponseEntity.ok(users);
   }
    
}
