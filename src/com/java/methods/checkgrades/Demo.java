package com.java.methods.checkgrades;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double grade = Double.parseDouble(input.nextLine());
        CheckGrades check = new CheckGrades();
        check.checkGrade(grade);
    }
}
