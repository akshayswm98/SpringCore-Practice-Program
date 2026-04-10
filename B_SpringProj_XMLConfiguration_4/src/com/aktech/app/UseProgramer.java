package com.aktech.app;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aktech.bean.Laptop;
import com.aktech.bean.Programer;

public class UseProgramer {
	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("com/aktech/resources/applicationContext.xml");
		Programer p1 = container.getBean(Programer.class);
		System.out.println("========Programer Claass Data========");
		System.err.println("Name Of Programer: "+p1.getName());
		System.out.println("=====================================");
		
		Laptop l1 = container.getBean(Laptop.class);
		System.err.println("=========Laptop Class Data============");
		System.out.println("Name Of Laptop: "+l1.getBrand());
		
		/*We can create two bean in a single xml file*/
		
	}

}
