package com.fdmgroup.SpringCoreExercise.model;

import java.util.Map;

public class UserRepository {
	private Map<Long, User> users;

	public UserRepository(Map<Long, User> users) {
		super();
		this.users = users;
	}
	
	public void addUser(User user){
		users.put(users., user)
	}
	
	public void removeUser(User user) {
		
	}
}
