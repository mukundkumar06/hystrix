package com.hystrix.controller;

import com.hystrix.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@Autowired UserService userService;

	@GetMapping("/user/{username}")
	public String getName(@PathVariable("username") String userName) {
		System.out.println("Inside UserController");
		return userService.getName(userName);
	}


}
