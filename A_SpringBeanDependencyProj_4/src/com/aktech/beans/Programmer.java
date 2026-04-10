package com.aktech.beans;

public class Programmer
{
	private LapTop lt; //Has-A-Relation

	public void setLt(LapTop lt) //using setter
	{
		this.lt = lt;
	}

	public void writeCode()
	{
		boolean res = lt.start();
		System.out.println("Writing Code");
	}
}
