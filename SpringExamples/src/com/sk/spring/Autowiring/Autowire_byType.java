package com.sk.spring.Autowiring; 
import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Autowire_byType {    
	public static void main(String[] args) {    
	    ApplicationContext context = new ClassPathXmlApplicationContext("Autowire_applnContext3.xml");  
	      
	    Elephant ele=(Elephant)context.getBean("elephant");  
	    System.out.println(ele.toString());
	}
}
