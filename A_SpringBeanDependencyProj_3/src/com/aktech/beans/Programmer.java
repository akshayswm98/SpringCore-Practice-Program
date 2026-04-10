package com.aktech.beans;

public class Programmer
{
	private LapTop lt; //Has-A-Relation
	
	public Programmer(LapTop lt) //dependency management using constructor.
	{	
		this.lt = lt;
	}

	public void writeCode()
	{
		boolean res = lt.start();
		System.out.println("Writing Code");
	}
}
