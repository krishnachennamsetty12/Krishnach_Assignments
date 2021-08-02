package com.Spring.Aquestion1;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class customer {
	
	Address a;

	/*public Address getA() {
		return a;
	}
	public void setA(Address a) {
		this.a = a;
	}*/
	
	int cuctId =101;
	String cname="krishna";
	String contact="9121460694";
	
	public customer(int cId, String cname, String contact,Address a) {
		super();
		this.cID = cId;
		this.cname = cname;
		this.contact = contact;
		this.a=a;
		
		
	}
	customer(Address a){
		this.a=a;
		
	}

	customer()
	{
		
	}
	
	public int getCId() {
		return cId;
	}

	public void setCuctId(int cId) {
		this.cId = cId;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "customer [cId=" + cId + ", cname=" + cname + ", contact=" + contact +  ", address="+a+"]";
	} 

	
	
	
	

}
