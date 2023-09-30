package com.challenges.hackerrank.thirtydaysofcode;

import java.util.Scanner;

public class Day21_Generics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        Integer[] integerArray = new Integer[n];
        for (int i = 0; i < n; i++) {
            integerArray[i] = scanner.nextInt();
        }

        n = scanner.nextInt();

        String[] stringArray = new String[n];
        for (int i = 0; i < n; i++) {
            stringArray[i] = scanner.next();
        }

        scanner.close();

        printArray(integerArray);
        printArray(stringArray);
    }
    static void printArray(Object[] array) {
        for (Object o : array) {
            System.out.println(o);
        }
    }
//    static <T> void printArray(T[] array) {
//        for (T element : array) {
//            System.out.println(element);
//        }
//    }
}
