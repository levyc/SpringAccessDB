package com.levy.test;

import static org.junit.Assert.*;

import java.security.interfaces.RSAKey;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.RowMapperResultSetExtractor;

import com.levy.Service;
import com.levy.entity.User;

public class TestUnit {
   // @Test
	/*public void testAdd() throws Exception {
	  ClassPathXmlApplicationContext classPathXmlApplicationContext  =  new ClassPathXmlApplicationContext("jdbcTemplate.xml");
	  User user = (User) classPathXmlApplicationContext.getBean("user");
	  User user2 = (User) classPathXmlApplicationContext.getBean("user");
	  user.setAddress("JYU");
	  user.setName("jack");
	  user.setPhoneNumber("110");
	  user.setSex("man");
	  user2.setAddress("JYU");
	  user2.setName("jack");
	  user2.setPhoneNumber("110");
	  user2.setSex("man");
	  Service service = (Service) classPathXmlApplicationContext.getBean("service");
	  service.addUser(user);
	  service.addUser(user2);
	}*/
	/*@Test
	public void testDelect() throws Exception {
		ClassPathXmlApplicationContext classPathXmlApplicationContext  =  new ClassPathXmlApplicationContext("jdbcTemplate.xml");
		Service service =	(Service) classPathXmlApplicationContext.getBean("service");
		service.delectUser(5);*/
	@Test
	public void testfindById() throws Exception {
		ClassPathXmlApplicationContext classPathXmlApplicationContext  =  new ClassPathXmlApplicationContext("jdbcTemplate.xml");
		Service service =	(Service) classPathXmlApplicationContext.getBean("service");
		User user = (User)service.findById(1);
		System.out.println(user.getAddress());
	}
	
	
		
	}
