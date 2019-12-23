package com.sk.spring.DependencyInjection; 
import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class DIConstructorMap {    
	public static void main(String[] args) {    
	    ApplicationContext context = new ClassPathXmlApplicationContext("DI_Constructor_applnContext5.xml");  
	      
	    Question2 emp=(Question2)context.getBean("quest");  
	    emp.displayInfo();
	}  

}
