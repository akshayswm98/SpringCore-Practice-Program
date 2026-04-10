package com.aktech.bean;

import java.util.List;

import org.springframework.scheduling.config.ContextLifecycleScheduledTaskRegistrar;

public class Subject 
{
	private List<String> subject;

	public void setSubject(List<String> subject) 
	{
		this.subject = subject;
	}

	@Override
	public String toString() 
	{
		return "Subject [subject=" + subject + "]";
	}
	
}
