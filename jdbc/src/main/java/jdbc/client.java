package jdbc;

import org.springframework.context.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class client {

	public static void main(String[] args)
	{
		
		ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		Employee e=(Employee)ctx.getBean("obj");
		// TODO Auto-generated method stub
		System.out.println(e.getHobbies());
	}
	
}
