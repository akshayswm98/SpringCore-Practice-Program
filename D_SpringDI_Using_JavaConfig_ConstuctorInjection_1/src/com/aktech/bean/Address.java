package com.aktech.bean;

import org.springframework.stereotype.Component;

//dependent class.
@Component
public class Address 
{
	private int houseNo;
	private String city;
	private int pinCode;
	
	public Address(int houseNo, String city, int pinCode) 
	{
		super();
		this.houseNo = houseNo;
		this.city = city;
		this.pinCode = pinCode;
	}
	
	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", city=" + city + ", pinCode=" + pinCode + "]";
	}
	
	
	
}
