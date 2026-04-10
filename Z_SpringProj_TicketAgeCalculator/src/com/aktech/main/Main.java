package com.aktech.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aktech.bean.TicketPriceCalculator;

public class Main 
{
	public static void main(String[] args) 
	{
		String path = "/com/aktech/resources/ApplicationContext.Xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(path);
		
		TicketPriceCalculator tc =(TicketPriceCalculator) context.getBean("ageCal");
		tc.calculatePrice();
	}

}
