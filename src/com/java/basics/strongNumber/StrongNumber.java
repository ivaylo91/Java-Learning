package com.java.basics.strongNumber;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int inputNumber = input.nextInt();
        int i;

        //declare variables for factorial value and the extracted digits
        int factorial,digit;

        //declare a variable to store the sum value
        int sum = 0;

        //transfer the input value to a temporary variable
        int temp = inputNumber;

        //start looping for calculating the result
        while(temp != 0) {
            i = 1;
            factorial = 1;

            //extracting the digit
            digit = temp % 10;

            //get the factorial of the digit
            while(i <= digit) {
                factorial = factorial * i;
                i++;
            }

            //store the sum value
            sum = sum + factorial;

            //removing the digit one by one
            temp = temp / 10;
        }

        //check condition
        if(sum == inputNumber)
            //if sum value is equal to input number
            System.out.println(inputNumber + " is a strong number\n");
        else
            //if sum value is not equal to input number
            System.out.println(inputNumber + " is not a strong number\n");
    }
}
