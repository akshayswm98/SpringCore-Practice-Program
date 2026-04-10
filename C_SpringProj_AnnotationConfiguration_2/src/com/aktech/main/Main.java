package com.aktech.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aktech.bean.Student;
import com.aktech.resources.SpringConfiguration;

public class Main 
{
	public static void main(String[] args) 
	{
		
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		Student std = context.getBean(Student.class);
		std.showData();
	}
}
