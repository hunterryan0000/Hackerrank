package com.challenges.hackerrank.thirtydaysofcode;

import java.util.Scanner;

public class Day1_DataTypes {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);
        Integer input = scan.nextInt();
        Double input2 = scan.nextDouble();
        String input3 = scan.next() + scan.nextLine();


        int addInt = i + input;
        double addDouble = d + input2;


        System.out.println(addInt);
        System.out.println(addDouble);
        System.out.println(s + input3);
    }
}

