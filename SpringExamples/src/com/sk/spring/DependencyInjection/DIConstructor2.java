package com.sk.spring.DependencyInjection; 
import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class DIConstructor2 {    
	public static void main(String[] args) {    
	    ApplicationContext context = new ClassPathXmlApplicationContext("DI_Constructor_applnContext2.xml");  
	      
	    Employee emp=(Employee)context.getBean("empbean");  
	    emp.show();
	}  

}
