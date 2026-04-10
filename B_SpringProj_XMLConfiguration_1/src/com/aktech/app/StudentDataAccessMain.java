package com.aktech.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aktech.bean.Student;

public class StudentDataAccessMain {

    public static void main(String[] args) {
    	
        ApplicationContext context =
            new ClassPathXmlApplicationContext("com/aktech/resources/applicationContext.xml");

        //down casting 
        Student s = (Student) context.getBean("stObj");//id 

        System.out.println("Name: " + s.getName());
        System.out.println("Roll No: " + s.getRollNo());
    }
}