package com.Spring.Aquestion2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Test.java {

	public static void main(String[] args) {
			
		ApplicationContext app= new ClassPathXmlApplicationContext("app.xml");
		Question c=app.getBean(Question.class);
		c.displayInfo();
		QuestionSet cc=app.getBean(Set.class);
		cc.displayInfoset();
		Questionmap ccc=app.getBean(.class);
		ccc.displayInfomap();
				
	}

}
