package com.spring.legend.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.spring.legend.model.User;

public class UserDaoImpl implements UserDao {

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Transactional
	public void addUser(User user) {
		System.out.println("dao Imple");
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(user);
		System.out.println("new user added");
	}

	@Transactional
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Transactional
	public void removeUser(int id) {
		// TODO Auto-generated method stub
		
	}

	@Transactional
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public List<User> listUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public User validateUser(String email, String password) {
		User user =null;
		Session session = this.sessionFactory.getCurrentSession();
		String hql = "from User "  + 
	                 "WHERE email = :email and password = :password";
		Query query = session.createQuery(hql);
		query.setParameter("email", email);
		query.setParameter("password", password);
		List results = query.list();
		if(results!=null && results.size()>0) {
			user = (User) results.get(0);
		} 
		return user;
	}

}
