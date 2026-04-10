package com.aktech.bean;



public class Programer 
{
	private String name;
	private Computer comp;

	public Programer() 
	{
		super();
		System.out.println("Programmer Bean Created");
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public Computer getComp() 
	{
		return comp;
	}

	public void setComp(Computer comp) 
	{
		this.comp = comp;
	}

	public void WriteCode() 
	{
		boolean res = comp.start();
		if(res) 
		{
			System.out.println("Started Coading");
		}
		else 
		{
			System.out.println("Cant Coding Started");
		}
		
	}
	
	
}
