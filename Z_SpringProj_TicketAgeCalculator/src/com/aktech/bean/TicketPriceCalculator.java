package com.aktech.bean;

public class TicketPriceCalculator 
{
	int age;

	public TicketPriceCalculator(int age) 
	{
		super();
		this.age = age;
	}
	
	public void calculatePrice()
	{
		if(age < 12)
		{
			System.out.println("Ticket Price: ₹100");
		}
		else if(age>=12 && age<=60)
		{
			System.out.println("Ticket Price: ₹200");
		}
		else
		{
			System.err.println("Ticket Price: ₹150");
		}
	}
	
	
}
