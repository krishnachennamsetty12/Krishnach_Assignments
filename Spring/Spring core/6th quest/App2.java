package com.Spring1.Aquestion6;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class App2{
	
	@Value("${db.value.dbname}")
	String dbname;
	@Value("${db.value.dburl}")
	String dburl ;
	 @Value("${db.value.username}")
	String username;
	 public void displayinfo() {
		System.out.println("dbname:"+dbname+"\ndburl:"+dburl+"\nusername:"+username);
	 }
			 
	
}
