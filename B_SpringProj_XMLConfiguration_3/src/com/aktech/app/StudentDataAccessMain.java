package com.aktech.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aktech.bean.Student;

public class StudentDataAccessMain {

    public static void main(String[] args) {
    	
        ApplicationContext context =
            new ClassPathXmlApplicationContext("com/aktech/resources/applicationContext.xml");

        
       // Student s = context.getBean(Student.class);//if we pass class name that time no need type casting

        //System.out.println("Name: " + s.getName());
        //System.out.println("Roll No: " + s.getRollNo());
        
        System.out.println("First Bean");
        System.out.println("===========================");
        Student s1 = (Student) context.getBean("stObj1");//when creating two been object need to pass object name.
        System.out.println("Name Is: "+s1.getName());
        System.out.println("Roll Number Is: "+s1.getRollNo());
        
        System.out.println("Second Bean");
        System.out.println("===========================");
        Student s2 = (Student) context.getBean("stObj2");
        System.out.println("Name Is: "+s2.getName());
        System.out.println("Roll Number Is: "+s2.getRollNo());
        
        /*when we want create two bean, we need to create separate been Object in configure file.*/

    }
}