package com.cg;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cg.dao.DaoAccess;
import com.cg.entities.Bank;




@SpringBootApplication
public class SpringStarterDemo2Application implements CommandLineRunner{

	
	@Autowired
	DaoAccess da;
	
	@Autowired
	Bank b;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringStarterDemo2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		b.setBankid(8);
		b.setName("sauhndeep");
//		b=da.findById(8);
//		System.out.println("Id : "+b.getBankid()+"\tName :"+b.getName());

//		Inserting into database
		//		da.create(b);
		
		
//		Getting Employees with name simlar to given name
		
		
		List<Bank> list=da.getEmployeesByName("sss");
		
		for(Bank data:list)
		{
			System.out.print("| Id :" +data.getBankid());
			System.out.println("\t| Name :"+data.getName()+"\t|");
		}
		
//		Getting Total Count of entries
		System.out.println(da.TotalStudentCount());
		
		
		da.updateBank(b);
		
		
	}

}
