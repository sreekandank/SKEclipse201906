package com.sk.spring.Example; 
import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class SpringDemo1 {    
	public static void main(String[] args) {    
	    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");  
	      
	    Student student=(Student)context.getBean("studentbean");  
	    student.displayInfo();  
	}  

}
