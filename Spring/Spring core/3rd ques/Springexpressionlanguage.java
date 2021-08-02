package com.Spring.Aquestion7;

import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Springexpressionlanguage {

	public static void main(String[] args) {
		SpelExpressionParser parser = new SpelExpressionParser();  
		 
		Expression exp = parser.parseExpression("'spring expression example....'");  
		String message = (String) exp.getValue();  
		System.out.println(message);  
		
		SpelExpressionParser parser1= new SpelExpressionParser();  
		Expression exp1 = parser.parseExpression("'spring expression example.....'.concat('concat process')");  
		String message1 = (String) exp1.getValue();  
		System.out.println(message1);  
		
		Expression exp3= parser.parseExpression("'spring expression example'.bytes.length");  
		int length = (Integer) exp3.getValue();  
		System.out.println(length);  
		
		System.out.println(parser.parseExpression("'krishna'.toUpperCase()").getValue());  
		System.out.println(parser.parseExpression("'KRISHNA'.toLowerCase()").getValue());  
	}

}
