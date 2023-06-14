package com.java.variables;

import java.util.Scanner;

public class SumOfChars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = Integer.parseInt(input.nextLine());
        int sum = 0;

        for (int i = 1; i <= num; i++) {
            String letter = input.nextLine();
            int ascii = letter.charAt(0);
            sum += ascii;
        }
        System.out.printf("The sum equals: %d", sum);
    }
}
