package com.zenjob.bookshelf.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.zenjob.bookshelf.model.User;

@Repository
public class UserRepository {

	private final Map<String, User> userMap;

	public UserRepository() {
		userMap = new HashMap<String, User>();
	}
	
	public User getUserByUsername(final String userName) {
		return userMap.get(userName);
	}

	public User save(User user) {
		userMap.put(user.getUserName(), user);
		return user;
	}
	
	public boolean userAlreadyExists(String userName) {
		return userMap.containsKey(userName);
	}
	
}
