package com.zenjob.bookshelf.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zenjob.bookshelf.model.User;
import com.zenjob.bookshelf.service.UserService;

@RestController
@RequestMapping(path = "/user")
public class UserController {
	
	private final UserService userService;
	
	@Autowired
	public UserController(final UserService userservice) {
		this.userService = userservice;
	}
	
	@GetMapping(path = "/", produces = APPLICATION_JSON_UTF8_VALUE)
	public Collection<User> getAllUsers() {
		return userService.getAllUsers();
	}
	
	@GetMapping(path = "/{userName}")
	public User getUserByUsername(@PathVariable String userName) {
		return userService.getUserByUsername(userName);
	}
	
	@PostMapping(path = "/{userName}", consumes = APPLICATION_JSON_UTF8_VALUE, produces = APPLICATION_JSON_UTF8_VALUE)
	public User createUser(@PathVariable String userName) {
		return userService.createUser(userName);
	}
}
