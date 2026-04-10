package com.aktech.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.aktech.bean.DatePrinter;

public class Main {

    public static void main(String[] args) {

        String path = "com/aktech/resources/ApplicationContext.XML";

        ApplicationContext context = new ClassPathXmlApplicationContext(path);

        DatePrinter printer = (DatePrinter) context.getBean("datePrinter");

        printer.printDate();
    }
}