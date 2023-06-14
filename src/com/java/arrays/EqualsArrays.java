package com.java.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EqualsArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] firstArray = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] secondArray = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        boolean areIdentical = true;
        int sum = 0;

        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] != secondArray[i]) {
                System.out.printf("Arrays are not identical.Found difference at %d index.", i);
                areIdentical = false;
                break;
            }
            sum += firstArray[i];
        }
        if (areIdentical) {
            System.out.printf("Arrays are identical.Sum:%d", sum);
        }
    }
}
