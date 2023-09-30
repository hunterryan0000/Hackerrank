package com.challenges.hackerrank.thirtydaysofcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Day11_2DArrays {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();

        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int sum = arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2)
                        + arr.get(i + 1).get(j + 1)
                        + arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);

//The outer loop for (int i = 0; i < 4; i++) iterates from 0 to 3, which represents the row indices of the
// top-left element of the hourglass pattern. Since there are six rows in total and we need three rows to form the hourglass,
// we only iterate up to the fourth row (index 3) to ensure we have enough rows remaining.
//
//The inner loop for (int j = 0; j < 4; j++) iterates from 0 to 3, which represents the column indices of the
// top-left element of the hourglass pattern. Similarly, we have six columns in total, and we need three columns for the hourglass.
// Therefore, we iterate up to the fourth column (index 3) to ensure we have enough columns remaining.
                maxSum = Math.max(maxSum, sum);
            }
        }

        System.out.println(maxSum);
    }

//    public static void main(String[] args) throws IOException {
//        twoD_Array(2, 4);
//
//
//    }

    public static void twoD_Array (int rowSize, int colSize){
        int[][] myArray = new int[rowSize][colSize];

        int count = 1;

        for(int i = 0; i < rowSize; i++) {

            for(int j = 0; j < colSize; j++, count++) {
                myArray[i][j] = count;
            }
        }

        myArray[1][1] = 0;

        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                System.out.print(myArray[i][j] + " "); //print col numbers
            }
            System.out.println(); //move to new line to print new row
        }
    }
}
