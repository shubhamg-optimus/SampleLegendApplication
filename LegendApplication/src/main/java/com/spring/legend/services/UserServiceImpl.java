package com.spring.legend.services;

import java.util.List;

import com.spring.legend.dao.OrganizationDao;
import com.spring.legend.dao.UserDao;
import com.spring.legend.model.User;

public class UserServiceImpl implements UserService{

	private UserDao userDao;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	@Override
	public void addUser(User user) {
		
		userDao.addUser(user);
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeUser(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> listUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User validateUser(String email, String password) {
		return userDao.validateUser(email, password);
	}

}
