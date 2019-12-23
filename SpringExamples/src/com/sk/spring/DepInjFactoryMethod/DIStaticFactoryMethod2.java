package com.sk.spring.DepInjFactoryMethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class DIStaticFactoryMethod2 {
	public static void main(String[] args) {    
	    ApplicationContext context = new ClassPathXmlApplicationContext("DI_FactoryMethod_applnContext2.xml");  
	      
	    Printable p=(Printable)context.getBean("p");  
	    p.print();
	}  

}
