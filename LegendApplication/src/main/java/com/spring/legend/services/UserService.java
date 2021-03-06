package com.spring.legend.services;

import java.util.List;

import com.spring.legend.model.User;

public interface UserService {

	public void addUser(User user);
	public void updateUser(User user);
	public void removeUser(int id);
	public User getUserById(int id);
	public User validateUser(String email, String password);
	public List<User> listUsers();
}
