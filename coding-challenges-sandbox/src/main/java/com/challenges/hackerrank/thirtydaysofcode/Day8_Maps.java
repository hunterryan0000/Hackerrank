package com.challenges.hackerrank.thirtydaysofcode;

import java.util.*;

public class Day8_Maps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer n = scanner.nextInt();
        scanner.nextLine();

        Map<String, String> phoneBook = new HashMap<>();

        String not = "Not found";

        String stringer = "";

        String[] split = new String[n];

        for (int t = 0; t < n; t++) {
            stringer = scanner.nextLine();
            split = stringer.trim().split(" ");
            phoneBook.put(split[0], split[1]);

        }

        String next = "";
        List<String> stringList = new ArrayList<>();

        while (scanner.hasNextLine()){
            next = scanner.nextLine().trim();
            if (next.isEmpty() || next.isBlank()){
                break;
            }
            stringList.add(next);
        }
        callMe(phoneBook, stringList, not);

    }
    public static void callMe(Map<String, String> map, List<String> param, String msg){

        for (int i = 0; i < param.size(); i++) {
            if (map.containsKey(param.get(i))) {
                String value = map.get(param.get(i));
                System.out.println(param.get(i) + "=" + value);
            } else {
                System.out.println(msg);
            }
        }
    }
}
