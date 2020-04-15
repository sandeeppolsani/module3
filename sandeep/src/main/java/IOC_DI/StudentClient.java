package IOC_DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("object1.xml");
		
		Student student=(Student)context.getBean("student");
		System.out.println(student.toString());

	}

}


//Normal Without autowiring


//</bean>
//<bean id="address" class="IOC_DI.Address">
//<property name="Houseno" value="53"></property>
//<property name="village" value="Kazipet"></property>
//<property name="district" value="Warangal Rural"></property>
//<property name="pincode" value="531000"></property>
//</bean>
//
//
//<bean id="student" class="IOC_DI.Student">
//<property name="name" value="sandeep"></property>
//<property name="regNO" value="11615147"></property>
//<property name="add" ref="address"></property>
//</bean>



//With Autowiring Byname
//Two or more beans can have same type

//<bean id="address" class="IOC_DI.Address">
//<property name="Houseno" value="53"></property>
//<property name="village" value="Kazipet"></property>
//<property name="district" value="Warangal Rural"></property>
//<property name="pincode" value="531000"></property>
//</bean>
//
//
//<bean id="student" class="IOC_DI.Student" autowire="byName">
//<property name="name" value="sandeep"></property>
//<property name="regNO" value="11615147"></property>
//</bean>



//With Autowiring Bytype
//Two or more beans should not have same type

//<bean id="add" class="IOC_DI.Address">
//<property name="Houseno" value="53"></property>
//<property name="village" value="Kazipet"></property>
//<property name="district" value="Warangal Rural"></property>
//<property name="pincode" value="531000"></property>
//</bean>
//
//
//<bean id="student" class="IOC_DI.Student" autowire="byType">
//<property name="name" value="sandeep"></property>
//<property name="regNO" value="11615147"></property>
//</bean>