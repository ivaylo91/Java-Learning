package com.java.methods.repeatString;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String repeatString = input.nextLine();
        int count = Integer.parseInt(input.nextLine());

        RepeatString repeatStr = new RepeatString(repeatString, 3);
        System.out.println(repeatStr.repeat());
    }
}
