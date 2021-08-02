  
package com.Spring1.Aquestion6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SuppressWarnings("unused")
@SpringBootApplication
@PropertySource("classpath:application.properties")
public class Test {

	public static void main(String[] args) {
		
	
		@SuppressWarnings("resource")
		ApplicationContext app= new AnnotationConfigApplicationContext(Test.class);
		
		App2 ob1=app.getBean(App2.class);
		System.out.println(ob1);
		ob1.displayinfo();
}
}
