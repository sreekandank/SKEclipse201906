package com.sk.spring.InheritingBean; 
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class InheritingBean {    
	public static void main(String[] args) {    
	    ApplicationContext context = new ClassPathXmlApplicationContext("DI_InheritingBean_applnContext.xml");  
	      
	    Employee emp=(Employee)context.getBean("emp2");  
	    emp.show();
	}  

}
