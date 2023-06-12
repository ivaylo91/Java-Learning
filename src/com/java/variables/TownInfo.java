package com.java.variables;

import java.util.Scanner;

public class TownInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String townName = input.nextLine();
        int population = Integer.parseInt(input.nextLine());
        int area = Integer.parseInt(input.nextLine());

        System.out.println(printInfo(townName,population,area));
    }
    public static String printInfo(String townName, int population, int area){
        return "Town " + townName +" has population of " +population + " and area " + area + " square km";
    }
}
