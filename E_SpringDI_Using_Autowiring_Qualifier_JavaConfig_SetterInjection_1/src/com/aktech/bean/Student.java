package com.aktech.bean;

import java.lang.foreign.AddressLayout;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
//target class.
@Component
public class Student 
{
	private String name;
	private int rollno;
	
	//no need to create setter method for address and subject.
	
	@Autowired
	@Qualifier("addr2")//using to avoid multiple been object.
	private Address address;//dependency injection.
	
	
	@Autowired
	private Subject sub1;
	
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
	
	public void display()
	{
		System.out.println("Student Name Is:- "+name);
		System.out.println("Student rollnumber is: "+rollno);
		System.out.println("Student Address is: "+address);
		System.out.println("Student Subject Is: "+sub1);
	}
	
	
	
}
