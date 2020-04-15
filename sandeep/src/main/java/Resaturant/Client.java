package Resaturant;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("object1.xml");
		Restaurant res=(Restaurant)context.getBean("Res");
		res.display();
		res.t.getTea();
	}

}
