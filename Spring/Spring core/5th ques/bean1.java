package com.Spring1.Aquestion5;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class bean1 {
	
	@Resource
	 private bean2 beanTwo;
		
	public void setBeanTwo(bean2 beanTwo) {
		this.beanTwo = beanTwo;
	}
		
	 public bean2 getBeanTwo() {
		return beanTwo;
	}


	public void print(){
		   System.out.println("bean1...!");
	      beanTwo.print();
	   }
}
