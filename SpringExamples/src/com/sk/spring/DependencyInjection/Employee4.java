package com.sk.spring.DependencyInjection;

public class Employee4 { 
	private int id;  
	private String name;  
	private Address2 address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address2 getAddress() {
		return address;
	}
	public void setAddress(Address2 address) {
		this.address = address;
	}  
	void displayInfo(){  
	    System.out.println(id+" "+name);  
	    System.out.println(address);  
	}
} 
 
