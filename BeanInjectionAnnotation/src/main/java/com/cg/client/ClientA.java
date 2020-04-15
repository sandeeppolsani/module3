package com.cg.client;

import org.springframework.context.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.cg.service.IService;
import com.cg.service.ServiceImplementation;
@ComponentScan("com")
public class ClientA {
	
	public static void main(String[] args)
	{
		ApplicationContext ctx=new AnnotationConfigApplicationContext(MyConfiguration.class);
		IService service=(IService) ctx.getBean("service");
		service.getBrandName();
	}
	
}
