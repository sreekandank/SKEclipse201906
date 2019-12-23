package com.sk.spring.DependencyInjection; 
import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class DISetterMethodCollection2 {    
	public static void main(String[] args) {    
	    ApplicationContext context = new ClassPathXmlApplicationContext("DI_SetterMethod_applnContext4.xml");  
	      
	    Question5 emp=(Question5)context.getBean("quest");  
	    emp.displayInfo();  
	}  

}
