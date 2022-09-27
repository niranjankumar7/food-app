package com.ty.springbootfood.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ty.springbootfood.dto.User;
import com.ty.springbootfood.services.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


@RestController
public class UserController {
	@Autowired
	UserService userService;
	@PostMapping("/addusers")
	public User saveUser(@RequestBody User user) {
		return userService.saveUser(user);
	}
	@GetMapping("/users")
	public List<User> getAllUsers(){
		return userService.getAllUsers();
	}
}