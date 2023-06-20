package com.java.lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumEqualNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] userInput = input.nextLine().split(" ");
        List<Double> numberList = new ArrayList<>();

        for (String stringInput : userInput) {
            numberList.add(Double.parseDouble(stringInput));
        }

        for (int i = 0; i < numberList.size() - 1; i++) {
            if (numberList.get(i).equals(numberList.get(i + 1))) {
                double sum = numberList.get(i) + numberList.get(i + 1);
                numberList.set(i, sum);
                numberList.remove(i + 1);
                i = i - 1;
            }
        }
        System.out.println(numberList.toString().replaceAll("[\\[\\],]", ""));
    }
}
