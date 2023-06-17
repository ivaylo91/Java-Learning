package com.java.methods.greatervalues;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String first = input.nextLine();
        String second = input.nextLine();

        GreaterValue greaterVal = new GreaterValue();
        System.out.println(greaterVal.getMax(first, second));
    }
}
