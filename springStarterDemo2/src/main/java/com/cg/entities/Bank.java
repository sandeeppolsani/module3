package com.cg.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="MYBank")
public class Bank {

	@Id
	@Column(name="bid")
	private int bankid;
	
	
	private String name; 


	public int getBankid() {
		return bankid;
	}


	public void setBankid(int bankid) {
		this.bankid = bankid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}
