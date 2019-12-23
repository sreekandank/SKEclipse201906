package com.sk.spring.DependencyInjection; 
import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class DISetterMethodCollection {    
	public static void main(String[] args) {    
	    ApplicationContext context = new ClassPathXmlApplicationContext("DI_SetterMethod_applnContext3.xml");  
	      
	    Question3 emp=(Question3)context.getBean("quest");  
	    emp.displayInfo();  
	}  

}
