package com.aktech.bean;

public class OutFitSuggester 
{
	int tempreture;

	public OutFitSuggester(int tempreture) 
	{
		super();
		this.tempreture = tempreture;
	}
	
	public void suggestedOutFit()
	{
		if(tempreture < 10)
		{
			System.out.println("Wear a heavy jacket");
		}
		else if(tempreture >= 10 && tempreture <= 20)
		{
			System.out.println("wear a sweater");
		}
		else 
		{
			System.out.println("Wear a light clothes");
		}
	}
	
	
}
