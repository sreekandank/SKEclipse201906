package com.sk.spring.Autowiring; 
import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class NoAutowire {    
	public static void main(String[] args) {    
	    ApplicationContext context = new ClassPathXmlApplicationContext("Autowire_applnContext.xml");  
	      
	    Cat c=(Cat)context.getBean("c");  
	    System.out.println(c.toString());
	}
}
