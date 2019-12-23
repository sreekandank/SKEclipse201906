package com.sk.spring.DependencyInjection; 
import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class DISetterMethodMap {    
	public static void main(String[] args) {    
	    ApplicationContext context = new ClassPathXmlApplicationContext("DI_SetterMethod_applnContext5.xml");  
	      
	    Question6 emp=(Question6)context.getBean("quest");  
	    emp.displayInfo();  
	}  

}
