package com.java.basics.triangle;

import java.util.Scanner;

public class TriangleOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int row = 0; row <= n; row++) {
            for (int col = 0; col < row; col++) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }
}
