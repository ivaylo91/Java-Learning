package com.java.basics.division;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int[] arr = {2, 3, 6, 7, 10};
        int x = 0;

        for (int i = 0; i < arr.length; i++) {
            if ((num % arr[i]) == 0 && (arr[i] > x)) {
                x = arr[i];
            }
        }
        if (x == 0) {
            System.out.println("Not divisible");
        } else {
            System.out.printf("The number is divisible by %d", x);
        }
    }
}
