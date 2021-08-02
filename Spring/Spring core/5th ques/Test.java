package com.Spring.Aquestion5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
public class SpringassignmentApplication {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context = 
	            new AnnotationConfigApplicationContext(SpringassignmentApplication.class);
		
		demobean1 demo=context.getBean(demobean1.class);
		demo.print();
		
	}

}
