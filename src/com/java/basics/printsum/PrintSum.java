package com.java.basics.printsum;

import java.util.Scanner;

public class PrintSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = {};
        int startInterval = input.nextInt();
        int endInterval = input.nextInt();
        int sum = 0;
        String line = "";
        for (int i = startInterval; i <= endInterval; i++) {
            line += i + " ";
            sum += i;
        }
        System.out.println(line);
        System.out.printf("Sum:%d", sum);
    }
}
