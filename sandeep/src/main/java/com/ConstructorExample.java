package com;

public class ConstructorExample {
	
	private String name;
	private int age;
	
	ConstructorExample(String name,int age) {
		// TODO Auto-generated constructor stub
		super();
		this.name=name;
		this.age=age;
	}
	public void display()
	{
		System.out.println("Name : "+this.name);
		System.out.println("Age : "+this.age);
	}

}
