package jdbc;
import java.util.List;

public class Employee {
	String name;
	String dept;
	List hobbies;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public List getHobbies() {
		return hobbies;
	}
	public void setHobbies(List hobbies) {
		this.hobbies = hobbies;
	}
	public void display()
	{
		System.out.println("Name:"+name);
		System.out.println("Department:"+dept);
		System.out.println("Hobbies:"+hobbies);
		
	}

}

