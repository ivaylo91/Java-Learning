package com.java.basics.passed;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Double grade = input.nextDouble();

        checkPassed check = new checkPassed(grade);

        System.out.println(check.printResult());
    }
}
