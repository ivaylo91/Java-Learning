package com.java.methods.checkgrades;

public class CheckGrades {
    public void checkGrade(double grade) {
        if (grade >= 2.00 && grade <= 2.99) {
            System.out.println("Fail!");
        } else if (grade >= 3.00 && grade <= 3.49) {
            System.out.println("Poor!");
        } else if (grade >= 3.50 && grade <= 4.99) {
            System.out.println("Good!");
        } else if (grade >= 5.00 && grade <= 5.49) {
            System.out.println("Very Good!");
        } else {
            System.out.println("Excellent!");
        }
    }
}
