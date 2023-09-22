package com.spring.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.spring.model.Main;

@Repository
public class UserDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	public int saveUser(Main main) {

		int id=(Integer) this.hibernateTemplate.save(main);
		return id;
	}
}
