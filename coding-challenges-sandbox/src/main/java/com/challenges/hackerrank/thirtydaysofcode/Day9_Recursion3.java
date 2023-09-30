package com.challenges.hackerrank.thirtydaysofcode;

public class Day9_Recursion3 {
    public static void main(String[] args) {
        System.out.println(Summation(3));
        System.out.println();
        System.out.println(Factorial(3));
        System.out.println();
        System.out.println(exponentiation(5,3));
    }

    public static int Summation(int n){
        //Base Case
        if (n <= 0) {
            return 0; //additive identity property
            //recursive case
        }else{
            //3+2+1+0
            return n + Summation(n-1);
        }
    }

    public static int Factorial(int n){
        if (n <= 1){
            return 1;
        } else{
            //(3*2*1)
            return n * Factorial(n-1);
        }
    }

    public static int exponentiation(int n, int p){
        if (p <= 0){
            return 1;
        } else{
            //5 * 5 * 5
            //3 , 2 , 1, 1
            return n * exponentiation(n, p-1);
        }
    }
}
