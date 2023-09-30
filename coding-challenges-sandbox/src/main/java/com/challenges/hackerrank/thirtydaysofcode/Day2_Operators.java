package com.challenges.hackerrank.thirtydaysofcode;

public class Day2_Operators {
    public static void main(String[] args) {
      solve(12.00, 20, 8);
    }
    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double tipTotal = (double) (tip_percent * meal_cost)/100;
        double taxTotal = (double) (tax_percent * meal_cost)/100;
        int totalCost = (int) (taxTotal + tipTotal + meal_cost);
        double total = tipTotal + taxTotal + meal_cost;

        System.out.println(Math.round(total));

    }

}
