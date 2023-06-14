package com.java.methods.calculations;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String operation = input.nextLine();
        int num1 = Integer.parseInt(input.nextLine());
        int num2 = Integer.parseInt(input.nextLine());

        Calculations calc = new Calculations();
        System.out.println(calc.calculate(operation, num1, num2));
    }
}
