package com.sk.spring.Autowiring; 
import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Autowire_annotation {    
	public static void main(String[] args) {    
	    ApplicationContext context = new ClassPathXmlApplicationContext("Autowire_applnContext5.xml");  
	      
	    Tiger t=(Tiger)context.getBean("tiger");  
	    System.out.println(t.toString());
	}
}
