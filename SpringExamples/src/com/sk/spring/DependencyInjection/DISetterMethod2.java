package com.sk.spring.DependencyInjection; 
import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class DISetterMethod2 {    
	public static void main(String[] args) {    
	    ApplicationContext context = new ClassPathXmlApplicationContext("DI_SetterMethod_applnContext2.xml");  
	      
	    Employee4 emp=(Employee4)context.getBean("empbean");  
	    emp.displayInfo();  
	}  

}
