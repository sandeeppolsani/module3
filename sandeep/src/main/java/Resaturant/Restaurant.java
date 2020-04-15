package Resaturant;

public class Restaurant {

	Tea t;
	String name;
	public Tea getT() {
		return t;
	}
	public void setT(Tea t) {
		this.t = t;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void display()
	{
		System.out.println("display");
	}
}
