package com.java.basics.student.info;

import java.text.DecimalFormat;

public class Student {
    private final String name;
    private final int age;
    private final double grade;

    private final DecimalFormat df = new DecimalFormat("0.00");
    public Student(String name, int age,double grade){
        this.name = name;
        this.age = age;
        this.grade = grade;

    }
    public String printInfo(){
        return "Name: " + name + " Age: " + age + " Grade: " + df.format(grade);
    }
}
