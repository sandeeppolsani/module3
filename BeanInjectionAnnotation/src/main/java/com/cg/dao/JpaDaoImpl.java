package com.cg.dao;

import org.springframework.stereotype.Component;

@Component
public class JpaDaoImpl implements IDao{

	public JpaDaoImpl()
	{
		System.out.println("Im constructor of JdbcDaoJpa");
	}
	
	public String getBrand() {
		// TODO Auto-generated method stub
		return "jpa";
	}

}
