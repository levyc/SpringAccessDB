package com.levy.Dao;

import java.util.List;

import com.levy.entity.User;

public interface UserDao {
	public void addUser(User user);

	public void delectUser(int id);

	public User findById(int id);

	public List findUser();

	public void updateUser(int id,String  object[]);
}
