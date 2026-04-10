package com.aktech.bean;

import javax.sound.midi.VoiceStatus;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student 
{
	@Value("akshay")
	private String name;
	@Value("101")
	private int stid;
	@Value("67")
	private float marks;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStid() {
		return stid;
	}
	public void setStid(int stid) {
		this.stid = stid;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	
	
	public void showData()
	{
		System.out.println("Student Name Is: "+name);
		System.out.println("Student Id Is: "+stid);
		System.out.println("Student Roll No: "+marks);
	}
}
