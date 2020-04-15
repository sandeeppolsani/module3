package jdbc;

import java.util.ArrayList;
import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration

@ComponentScan("jdbc")
@ComponentScan("jdbc1")
public class AppConfig {
	public Employee e2()
	{
		Employee e1=new Employee();
		e1.setDept("hr");
		List l1=new ArrayList();
		l1.add("cricket");
		l1.add("basket ball");
		e1.setHobbies(l1);
		e1.setName("teja");
		return e1;
	}
	
	
}
