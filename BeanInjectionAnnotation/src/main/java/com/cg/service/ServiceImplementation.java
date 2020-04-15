package com.cg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.cg.dao.*;
@Component("service")
public class ServiceImplementation implements IService {

	private IDao dao;
	
	public ServiceImplementation()
	{
		System.out.println("servicec constructor");
	}
	
	
	@Autowired
	@Qualifier("jpadao")
	public void setDao(IDao dao)
	{
		System.out.println("Dao injected");
		this.dao=dao;
	}
	
	public String getBrandName() {
		return dao.getBrand();
	}
		
}
