package com.challenges.hackerrank.thirtydaysofcode;

import java.util.Collections;
import java.util.Scanner;

public class Day17_MoreExceptions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tests = scanner.nextInt();

        scanner.nextLine();

        int[] nums = new int[tests*2];
        Calculator calculator = new Calculator();

        for (int i = 0; i < nums.length; i++) {
            int num = scanner.nextInt();
            nums[i] = num;
        }

        for (int i = 0; i < nums.length; i+=2) {
            try {
                System.out.println(calculator.power(nums[i], nums[i+1]));
            } catch (NumberFormatException e){
                System.out.println(e.getMessage());
            }
        }


    }

    static class Calculator {
        public int power(int n, int p) {
            if (n < 0 || p < 0) {
                throw new NumberFormatException("n and p should be non-negative");
            }
            return (int) Math.pow(n, p);
        }
    }
}
