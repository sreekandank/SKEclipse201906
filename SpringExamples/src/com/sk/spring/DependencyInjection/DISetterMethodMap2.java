package com.sk.spring.DependencyInjection; 
import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class DISetterMethodMap2 {    
	public static void main(String[] args) {    
	    ApplicationContext context = new ClassPathXmlApplicationContext("DI_SetterMethod_applnContext6.xml");  
	      
	    Question7 emp=(Question7)context.getBean("quest");  
	    emp.displayInfo();  
	}  

}
