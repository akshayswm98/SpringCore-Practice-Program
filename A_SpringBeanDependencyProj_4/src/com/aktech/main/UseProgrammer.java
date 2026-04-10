package com.aktech.main;

import com.aktech.beans.LapTop;
import com.aktech.beans.Programmer;

public class UseProgrammer 
{
	public static void main(String[] args) 
	{
		LapTop obj = new LapTop();
		Programmer p = new Programmer();
		p.setLt(obj);
		p.writeCode();
	}
}
