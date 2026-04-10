package com.aktech.bean;

import java.lang.foreign.AddressLayout;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
//target class.
@Component
public class Student 
{
	private String name;
	private int rollno;
	
	@Autowired
	private Address address;//dependency injection.
	
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public int getRollno() 
	{
		return rollno;
	}
	public void setRollno(int rollno) 
	{
		this.rollno = rollno;
	}
	/*
	public Address getAddress() 
	{
		return address;
	}
	public void setAddress(Address address) 
	{
		this.address = address;
	}
	*/
	public void display()
	{
		System.out.println("Student Name Is:- "+name);
		System.out.println("Student rollnumber is: "+rollno);
		System.out.println("Student Address is: "+address);
	}
	
	
	
}
