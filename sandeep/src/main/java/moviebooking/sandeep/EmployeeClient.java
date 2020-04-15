package moviebooking.sandeep;
import com.ConstructorExample;
import java.util.ResourceBundle;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class EmployeeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
//		Resource r=new ClassPathResource("object1.xml");
//		BeanFactory bf=new XmlBeanFactory(r);
		ApplicationContext context = new ClassPathXmlApplicationContext("object1.xml");
//		ApplicationContext context = new FileSystemXmlApplicationContext("object1.xml");
		Employee emr=(Employee)context.getBean("emp");
		System.out.println(emr.getName());
		ConstructorExample cs=(ConstructorExample)context.getBean("stu");
		cs.display();
			
			
			
	}

}
