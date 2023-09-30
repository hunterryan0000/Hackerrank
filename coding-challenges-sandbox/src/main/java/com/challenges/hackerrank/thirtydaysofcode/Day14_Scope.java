package com.challenges.hackerrank.thirtydaysofcode;

import java.util.Scanner;

public class Day14_Scope {
    public static void main(String[] args) {
//        int[] elements = {1, 5, 3, 9, 2};
//        Difference difference = new Difference(elements);
//        int maxDiff = difference.computeDifference();
//        System.out.println("Maximum Difference: " + maxDiff);

        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] ints = new int[size];
        scanner.nextLine();

        String numbers = scanner.nextLine();
        String[] nums = numbers.split(" ");

        for (int i = 0; i < nums.length; i++) {
            ints[i] = Integer.parseInt(nums[i]);
        }

        Difference difference = new Difference(ints);
        int max = difference.computeDifference();
        System.out.println(max);
    }

    static class Difference{
        int n;
        private int[] __elements;
        int maximumDifference;

        public Difference(int[] arr){
            this.__elements = arr;
        }

        public int computeDifference(){
            int minElement = Integer.MAX_VALUE;
            int maxElement = Integer.MIN_VALUE;

            // Find the minimum and maximum elements in __elements array
            for (int element : __elements) {
                minElement = Math.min(minElement, element);
                maxElement = Math.max(maxElement, element);
            }

            // Calculate the maximum difference
            maximumDifference = Math.abs(maxElement - minElement);

            return maximumDifference;
        }

    }
}
