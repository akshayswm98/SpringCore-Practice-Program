package com.aktech.bean;

import java.time.LocalDate;

public class DatePrinter {

    private LocalDate currentDate;

    // Constructor Injection
    public DatePrinter(LocalDate currentDate) 
    {
        this.currentDate = currentDate;
    }

    public void printDate() 
    {
        System.out.println("Todays Date Is: "+currentDate); // Default format: YYYY-MM-DD
    }
}