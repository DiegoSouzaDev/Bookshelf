package com.zenjob.bookshelf.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zenjob.bookshelf.exception.UserAlreadyExistsException;
import com.zenjob.bookshelf.model.User;
import com.zenjob.bookshelf.repository.UserRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class UserService {
	
	private final UserRepository userRepository;
	
	@Autowired
	public UserService(final UserRepository userRepository) {
		this.userRepository = userRepository;
		
	}
	
	public User getUserByUsername(String userName) {
		log.debug("Fetching user by username: {}", userName);
		return userRepository.getUserByUsername(userName);
	}
	
	public User create(final String userName) throws UserAlreadyExistsException {
		log.debug("Creating a user with username: {}", userName);
		if (userRepository.userAlreadyExists(userName)) {
			throw new UserAlreadyExistsException();
		}
		return userRepository.save(new User(userName));
	}
	
}
