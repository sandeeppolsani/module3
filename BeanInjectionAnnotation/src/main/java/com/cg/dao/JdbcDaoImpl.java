package com.cg.dao;

import org.springframework.stereotype.Component;

@Component
public class JdbcDaoImpl implements IDao {

	
	public JdbcDaoImpl()
	{
		System.out.println("Im constructor of JdbcDaoImpl");
	}
	
	public String getBrand() {
		// TODO Auto-generated method stub
		return "jdbc";
	}

}
