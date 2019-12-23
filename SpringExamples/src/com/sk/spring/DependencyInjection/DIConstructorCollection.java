package com.sk.spring.DependencyInjection; 
import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class DIConstructorCollection {    
	public static void main(String[] args) {    
	    ApplicationContext context = new ClassPathXmlApplicationContext("DI_Constructor_applnContext4.xml");  
	      
	    Question emp=(Question)context.getBean("quest");  
	    emp.displayInfo();
	}  

}
