package com.sk.spring.DependencyInjection; 
import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class DIConstructorDependentObject {    
	public static void main(String[] args) {    
	    ApplicationContext context = new ClassPathXmlApplicationContext("DI_Constructor_applnContext3.xml");  
	      
	    Employee2 emp=(Employee2)context.getBean("empbean");  
	    emp.show();
	}  

}
