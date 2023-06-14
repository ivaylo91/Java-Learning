package com.java.arrays;

import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        int[] numbers = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(input.nextLine());
            numbers[i] = number;
        }
        for (int number : numbers) {
            if (number % 2 == 0) {
                sum += number;
            }
        }
        System.out.println(sum);
    }
}
