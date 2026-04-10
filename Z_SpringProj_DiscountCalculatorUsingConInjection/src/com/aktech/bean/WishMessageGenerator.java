package com.aktech.bean;

import java.time.LocalDateTime;

public class WishMessageGenerator 
{
	private LocalDateTime currDateTime;

	public WishMessageGenerator(LocalDateTime currDateTime) 
	{
		super();
		this.currDateTime = currDateTime;
	}
	
	public String generateWishMessage()
	{
		int hour = currDateTime.getHour();
		if (hour < 12) 
		{
            return "Good Morning";
        } 
        else if (hour >= 12 && hour < 18) 
        {
            return "Good Afternoon";
        } 
        else 
        {
            return "Good Evening";
        }
	}
	
	
}
