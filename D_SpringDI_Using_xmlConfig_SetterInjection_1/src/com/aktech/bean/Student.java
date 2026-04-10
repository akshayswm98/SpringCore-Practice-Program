package com.aktech.bean;

import java.lang.foreign.AddressLayout;
//target class.
public class Student 
{
	private String name;
	private int rollno;
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
	public Address getAddress() 
	{
		return address;
	}
	public void setAddress(Address address) 
	{
		this.address = address;
	}
	
	public void display()
	{
		System.out.println("Student Name Is:- "+name);
		System.out.println("Student rollnumber is: "+rollno);
		System.out.println("Student Address is: "+address);
	}
	
	
	
}
