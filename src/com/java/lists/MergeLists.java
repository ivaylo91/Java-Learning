package com.java.lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergeLists {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<Integer> firstList = Arrays.stream(input.nextLine().split(" ")).
                map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondList = Arrays.stream(input.nextLine().split(" ")).
                map(Integer::parseInt).collect(Collectors.toList());

        int size = Math.min(firstList.size(), secondList.size());

        for (int i = 0; i < size; i++) {
            System.out.print(firstList.get(i) + " " + secondList.get(i) + " ");
        }
        printRest(firstList, size);
        printRest(secondList, size);
    }

    private static void printRest(List<Integer> numbers, int beginIndex) {
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i) + " ");
        }
    }
}
