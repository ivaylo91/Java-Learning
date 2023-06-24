package com.java.lists;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveNegativeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(input.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        numbers.removeIf(n -> n < 0);
        Collections.reverse(numbers);

        if (numbers.isEmpty()) {
            System.out.println("empty");
        } else {
            System.out.println(numbers.toString().replaceAll("[\\[\\]],", ""));
        }
    }
}
