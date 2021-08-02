package com.Spring.Aquestion1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Test {

	public static void main(String[] args) {
		
	
		
		ApplicationContext app= new ClassPathXmlApplicationContext("app.xml");
		Customer c=app.getBean(Customer.class);
		System.out.println(c.toString());
	}

}
