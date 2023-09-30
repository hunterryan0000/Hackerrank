package com.challenges.hackerrank.thirtydaysofcode;

import java.util.*;

public class Day15_LinkedList {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int n = scanner.nextInt();

                scanner.nextLine();

                List<Integer> myList = new LinkedList<>();

                for (int i = 0; i < n; i++) {
                        int next = scanner.nextInt();
                        myList.add(next);
                }

                for (int i = 0; i < myList.size(); i++) {
                        if(i == myList.size() - 1){
                                System.out.println(myList.get(i));
                        } else
                        System.out.print(myList.get(i) + " ");
                }

        }
}
