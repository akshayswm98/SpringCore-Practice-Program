package com.aktech.bean;

public class ElectricityBillCalculator 
{
	int unit;

	public ElectricityBillCalculator(int unit) 
	{
		super();
		this.unit = unit;
	}
	
	public void calculateBill()
	{
		double bill;
		if(unit>=0 && unit<=100)
		{
			bill = unit*1.5;
		}
		else if(unit<=300)
		{
			 bill = (100 * 1.5) + ((unit - 100) * 2.5);
		}
		else 
			{
			 bill = (100 * 1.5) + (200 * 2.5) + ((unit - 300) * 4);
			}
		System.out.println("Total Bill: ₹" + bill);
			
	}
	
}
