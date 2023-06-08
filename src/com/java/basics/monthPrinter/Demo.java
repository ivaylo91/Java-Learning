package com.java.basics.monthPrinter;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month = input.nextInt();
        String [] months = {"January", "February","March","April","May","June","July","August","September","October","November","December"};

        MonthPrinter monthPrinter = new MonthPrinter(month);
        System.out.println(monthPrinter.printMonth(months));
    }
}
