package com.challenges.hackerrank.thirtydaysofcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Day20_Sorting {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        // Write your code here
        System.out.printf("Array is sorted in %d swaps. %n", bubbleSort(a));
        System.out.println("First Element: " + a.get(0));
        System.out.println("Last Element: " + a.get(a.size() - 1));


        bufferedReader.close();
    }

    static int bubbleSort (List<Integer> arr){
        // Track number of elements swapped during a single array traversal
        int numberOfSwaps = 0;
        //loop through list to keep the order of the list
        for (int i = 0; i < arr.size(); i++) {
            //loop to change elements
            for (int j = 0; j < arr.size() - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (arr.get(j) > arr.get(j + 1)) {
                    int swap = arr.get(j);
                    arr.set(j, arr.get(j + 1)); //set (index, element)
                    arr.set(j + 1, swap);
                    numberOfSwaps++;
                }
            }
            // If no elements were swapped during a traversal, array is sorted
            if (numberOfSwaps == 0) {
                break;
            }
        }
        return numberOfSwaps;
    }
}
