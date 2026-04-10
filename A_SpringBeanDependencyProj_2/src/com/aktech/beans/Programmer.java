package com.aktech.beans;

public class Programmer
{
	private LapTop lt; //Has-A-Relation
	public void writeCode()
	{
		lt = new LapTop();
		boolean res = lt.start();
		System.out.println("Writing Code");
	}
}
