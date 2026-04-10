package com.aktech.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.aktech.bean.Student;
import com.aktech.resources.SpringConfigFile;

public class Main 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
		Student std = (Student) context.getBean("stdId");
		System.out.println("Name Is: "+std.getName());
		System.out.println("Roll Is: "+std.getRollno());
		System.out.println("Email Is: "+std.getEmail());
		
	}
}
