package com.java.arrays;

import java.util.Scanner;

public class PrintReversOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(input.nextLine());
            numbers[i] = number;
        }
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}
