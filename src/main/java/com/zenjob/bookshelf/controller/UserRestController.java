package com.zenjob.bookshelf.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zenjob.bookshelf.exception.UserAlreadyExistsException;
import com.zenjob.bookshelf.model.User;
import com.zenjob.bookshelf.service.UserService;

@RestController
@RequestMapping(path = "/user")
public class UserRestController {
	
	private final UserService userService;
	
	@Autowired
	public UserRestController(final UserService userservice) {
		this.userService = userservice;
	}
	
	@PostMapping(path = "/", produces = APPLICATION_JSON_UTF8_VALUE)
	public User createUser(@RequestBody String userName) throws UserAlreadyExistsException {
		return userService.create(userName);
	}
	
	@GetMapping(path = "/")
	public String hi() {
		return "Hallo Welt";
	}
	
}
