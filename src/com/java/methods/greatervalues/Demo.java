package com.java.methods.greatervalues;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //String values
        String first = input.nextLine();
        String second = input.nextLine();
        //Char values
        char ch1 = input.nextLine().charAt(0);
        char ch2 = input.nextLine().charAt(0);
        // IntegerValues
        int val1 = Integer.parseInt(input.nextLine());
        int val2 = Integer.parseInt(input.nextLine());


        GreaterValue greaterVal = new GreaterValue();
        System.out.println(greaterVal.getMax(first, second)); // output string values
        System.out.println(greaterVal.getMax(ch1, ch2));     // output char values
        System.out.println(greaterVal.getMax(val1, val2));   // output int values

    }
}
