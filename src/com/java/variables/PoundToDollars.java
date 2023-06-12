package com.java.variables;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PoundToDollars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pound = Integer.parseInt(input.nextLine());
        DecimalFormat df = new DecimalFormat("0.00");
        double dollars = pound * 1.31;
        System.out.println(df.format(dollars));
    }
}
