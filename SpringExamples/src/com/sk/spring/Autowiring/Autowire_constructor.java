package com.sk.spring.Autowiring; 
import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Autowire_constructor {    
	public static void main(String[] args) {    
	    ApplicationContext context = new ClassPathXmlApplicationContext("Autowire_applnContext4.xml");  
	      
	    Frog f=(Frog)context.getBean("frog");  
	    System.out.println(f.toString());
	}
}
