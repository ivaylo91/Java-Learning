package com.java.basics.student.info;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        int age = input.nextInt();
        double grade = input.nextDouble();

        Student student = new Student(name,age,grade);
        System.out.println(student.printInfo());
    }
}
