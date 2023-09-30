package com.challenges.hackerrank.thirtydaysofcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.BinaryOperator;

public class Day10_BinaryNumbers {
    public static void main(String[] args) throws IOException {

        // Then find and print the base-10 integer denoting the maximum number of consecutive 1's in n's binary representation.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();

        List<Integer> binaryList = convertToBinary(n);
//        Stack<Integer> binaryStack = convertToBinaryStack(n);
//        Queue<Integer> binaryQueue = convertToBinaryQueue(n);

        System.out.println(binaryList);
//        System.out.println(binaryStack);
//        System.out.println(binaryQueue);

        int maxConsecutiveOnes = 0;
        int currentConsecutiveOnes = 0;

        for (Integer binaryDigit : binaryList) {
            if (binaryDigit == 1) {
                currentConsecutiveOnes++;
                if (currentConsecutiveOnes > maxConsecutiveOnes) {
                    maxConsecutiveOnes = currentConsecutiveOnes;
                }
            } else {
                currentConsecutiveOnes = 0;
            }
        }

        System.out.println("Max Consecutive 1's: " + maxConsecutiveOnes);

    }

    private static List<Integer> convertToBinary(int n) {
        List<Integer> binaryList = new ArrayList<>();

        while (n > 0) {
            int remainder = n % 2;
            n = n / 2;
            binaryList.add(0, remainder);
        }

        return binaryList;
    }

    private static Stack<Integer> convertToBinaryStack(int n) {
        Stack<Integer> binaryStack = new Stack<>();

        while (n > 0) {
            int remainder = n % 2;
            n = n / 2;
            binaryStack.push(remainder);
        }
        Collections.reverse(binaryStack);

        return binaryStack;
    }

    private static Queue<Integer> convertToBinaryQueue(int n) {
        Queue<Integer> binaryQueue = new LinkedList<>();

        while (n > 0) {
            int remainder = n % 2;
            n = n / 2;
            binaryQueue.offer(remainder);
        }

        Collections.reverse((List<?>) binaryQueue);

        return binaryQueue;
    }



}
