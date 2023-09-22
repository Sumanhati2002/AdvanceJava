package com.spring.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spring.model.User;


@Repository
public class UserDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public int saveUser(User user) {
		
		int i=(Integer) this.hibernateTemplate.save(user);
		return i;
	}

	//fetch all users from database
	public List<User> getUser() {
		return this.hibernateTemplate.loadAll(User.class);
	}

	public void deleteUser(int id) {
	
		User u=this.hibernateTemplate.load(User.class, id);
		
		 this.hibernateTemplate.delete(u);
	}

	public User getUser(int id) {
		return this.hibernateTemplate.get(User.class,id);
		
	}

	
}
