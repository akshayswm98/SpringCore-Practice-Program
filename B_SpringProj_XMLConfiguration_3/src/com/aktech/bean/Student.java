package com.aktech.bean;

public class Student {

    private int rollNo;
    private String name;

    // Default constructor
    public Student() {
    }

    // Getter
    public int getRollNo() {
        return rollNo;
    }

    // Setter
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }
}

/*Industry standard in bean package we can create POJO class Bean Class Component class*/