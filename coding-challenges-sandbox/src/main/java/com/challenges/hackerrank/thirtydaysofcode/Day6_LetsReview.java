package com.challenges.hackerrank.thirtydaysofcode;

import java.util.Scanner;

public class Day6_LetsReview {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Read the number of test cases
        scanner.nextLine(); // Move to the next line

        for (int t = 0; t < n; t++) {
            String input = scanner.nextLine(); //capture input per test case

            String odds = "";
            String evens = "";

            for (int i = 0; i < input.length(); i++) {
                if (i % 2 == 0) {
                    evens += input.charAt(i);
                } else {
                    odds += input.charAt(i);
                }
            }

            System.out.println(evens.trim() + " " + odds.trim());
        }
    }
}
