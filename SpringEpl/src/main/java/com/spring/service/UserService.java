package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.UserDao;
import com.spring.model.Main;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;
	public int createUser(Main main) {
		
		return this.userDao.saveUser(main);
	}
}
