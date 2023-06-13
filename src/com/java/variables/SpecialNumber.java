package com.java.variables;

import java.util.Scanner;

public class SpecialNumber {
    // function calculate the factorial of digits
    static int factiorial(int n) {
        if (n == 0)
            return 1;
        return n * factiorial(n - 1);
    }

    public static boolean isNumberSpecial(int n) {
        int digit, sum = 0, temp = n;
        // Extract digits and sum their factorial
        while (temp != 0) {
            digit = temp % 10;
            // calling factorial function to calculate factorial of digit
            sum += factiorial(digit); // adding it to sum
            temp = temp / 10;
        }
        return sum == n; // whether sum is equal to original number
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number to be checked special");
        int n = scn.nextInt();

        // now calling isNumberSpecial function
        if (isNumberSpecial(n))
            System.out.println(n + " is a Special Number");
        else
            System.out.println(n + " is not a Special Number");
    }

}

