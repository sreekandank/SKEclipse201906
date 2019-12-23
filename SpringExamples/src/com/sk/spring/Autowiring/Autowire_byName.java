package com.sk.spring.Autowiring; 
import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Autowire_byName {    
	public static void main(String[] args) {    
	    ApplicationContext context = new ClassPathXmlApplicationContext("Autowire_applnContext2.xml");  
	      
	    Dog dog=(Dog)context.getBean("dog");  
	    System.out.println(dog.toString());
	}
}
