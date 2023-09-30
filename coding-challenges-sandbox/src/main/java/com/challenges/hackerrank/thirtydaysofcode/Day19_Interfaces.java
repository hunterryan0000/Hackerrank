package com.challenges.hackerrank.thirtydaysofcode;

import java.util.Scanner;

public class Day19_Interfaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        Calculator calculator = new Calculator();

        calculator.divisorSum(n);


    }
    interface AdvanceArithmetic{
        void divisorSum(int n);
    }

    static class Calculator implements AdvanceArithmetic{

        @Override
        public void divisorSum(int n) {
            int divisor = 0;
            for (int i = 1; i <= n; i++) {
                if(n % i == 0){
                    divisor += i;
                }
            }
            System.out.println("I implemented: AdvancedArithmetic");
            System.out.println(divisor);
        }
    }
}
