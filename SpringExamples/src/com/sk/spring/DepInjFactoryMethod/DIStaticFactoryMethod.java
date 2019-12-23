package com.sk.spring.DepInjFactoryMethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class DIStaticFactoryMethod {
	public static void main(String[] args) {    
	    ApplicationContext context = new ClassPathXmlApplicationContext("DI_FactoryMethod_applnContext.xml");  
	      
	    A a=(A)context.getBean("a");  
	    a.msg();
	}  

}
