package com.java.arrays;

import java.lang.reflect.Array;

public class ReverseArrayOfString {
    public static void main(String[] args) {
        String[] arr = new String[]{"a", "b", "c"};
        System.out.println(reverse(arr));
    }

    public static String reverse(String[] arr) {
        String line = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            line += arr[i];
        }
        return line + " ";
    }
}
