package com.zenjob.bookshelf.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zenjob.bookshelf.model.User;
import com.zenjob.bookshelf.repository.UserRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService {
	
	private final UserRepository userRepository;

	@Autowired
	public UserService(final UserRepository userRepository) {
		this.userRepository = userRepository;
		
	}
	
	public Collection<User> getAllUsers() {
		log.debug("Fetching all users");
		return userRepository.getAll();
	}

	public User getUserByUsername(String userName) {
		log.debug("Fetching user by username: {}", userName);
		return userRepository.getUserByUsername(userName);
	}
	
	public User createUser(String userName) {
		log.debug("Creating a user with username: {}", userName);
		final User user = userRepository.save(userName);
	}
	
}
