package com.levy;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.omg.CORBA.OBJ_ADAPTER;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.levy.Dao.UserDao;
import com.levy.entity.User;

public  class Service implements UserDao {
	private static final RowMapper UserRowmap = null;
	private JdbcTemplate jcTemplate ;
	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		String sql = "insert into UserInf(name,sex,address,phoneNumber) values(?,?,?,?)" ;
		Object[] params  = new Object[]{user.name,user.sex,user.address,user.phoneNumber};
		jcTemplate.update(sql,params);
	}

	@Override
	public void delectUser(int id) {
		// TODO Auto-generated method stub
		String sql = "delete from UserInf where id = ? " ;
		jcTemplate.update(sql,id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
		String sql= "SELECT * from UserInf where id ="+id;
  	return (User)jcTemplate.queryForObject(sql,new UserRowmap());
	}

	@Override
	public List findUser() {
		// TODO Auto-generated method stub
	   String sql  = "select * from UserInf";
	   List list =jcTemplate.queryForList(sql);
	   for(Object object :list){
		   System.out.println(object);
	   }
	   return list;
	}

	@Override
	public void updateUser(int id,String params[]) {
		// TODO Auto-generated method stub
		String sql= "SELECT * from UserInf where id ="+id;
	  User user =(User)jcTemplate.queryForObject(sql, new UserRowmap());
	   user.setAddress(params[2]);
	   user.setSex(params[1]);
	   user.setName(params[0]);
	   user.setPhoneNumber(params[3]);
	   addUser(user);
	}

	public JdbcTemplate getJcTemplate() {
		return jcTemplate;
	}

	public void setJcTemplate(JdbcTemplate jcTemplate) {
		this.jcTemplate = jcTemplate;
	}
     
} class UserRowmap implements RowMapper
{

	@Override
	public Object mapRow(ResultSet arg0, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		User user = new User();
		user.setName(arg0.getString("name"));
		user.setSex(arg0.getString("sex"));
		user.setAddress(arg0.getString("address"));
		user.setPhoneNumber(arg0.getString("phoneNumber"));
		return user;
	}
	
}