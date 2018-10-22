package com.zenjob.bookshelf.repository;

import java.util.Collection;
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

	public Collection<User> getAll() {
		return userMap.values();
	}

	public User getUserByUsername(final String userName) {
		return userMap.get(userName);
	}
	
	public User save(String userName) {
		final User user = new User(userMap.size() + 1, userName);
		userMap.put(user.getUserName(), user);
		return user;
	}

}
