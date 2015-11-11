package com.levy.Dao;

import java.util.List;

public interface UserDao {
	public void addUser();

	public void delectUser();

	public User findById(int id);

	public List findUser();

	public void updateUser();
}
