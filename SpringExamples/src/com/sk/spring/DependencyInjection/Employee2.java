package com.sk.spring.DependencyInjection;

public class Employee2 {
	private int id;  
	private String name;  
	private Address address;//Aggregation  
	  
	public Employee2() {System.out.println("def cons");}  
	  
	public Employee2(int id, String name, Address address) {  
	    super();  
	    this.id = id;  
	    this.name = name;  
	    this.address = address;  
	}  
	  
	void show(){  
	    System.out.println(id+" "+name);  
	    System.out.println(address.toString());  
	}  
	  
} 
