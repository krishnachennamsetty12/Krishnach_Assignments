package com.Spring.Aquestion1;

import org.springframework.stereotype.Component;

@Component
public class Address {
	String street="chatrapathiroad";
	String city="visakhapatnam";
	String state="Andhra";
	String zipcode="530013";
	String country="India";


	public Address(String street, String city, String state, String zipcode, String country) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.country = country;
	}

	Address()
	{
		
	}
	
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", state=" + state + ", zipcode=" + zipcode
				+ ", country=" + country + "]";
	}
	
	

}
