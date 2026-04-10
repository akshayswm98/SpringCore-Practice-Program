package com.aktech.bean;
//bytype
import java.lang.foreign.AddressLayout;
//target class.
public class Student 
{
	private String name;
	private int rollno;
	private Address address;//dependency injection.
	
	
	
	public Student(String name, int rollno, Address address) 
	{
		super();
		this.name = name;
		this.rollno = rollno;
		this.address = address;
	}



	public void display()
	{
		System.out.println("Student Name Is:- "+name);
		System.out.println("Student rollnumber is: "+rollno);
		System.out.println("Student Address is: "+address);
	}
	
	
	
}
