package com.challenges.katas;

import java.lang.reflect.Array;
import java.util.*;

public class Kata {
    public static void main(String[] args) {
//        System.out.println(evenlySpaced(2, 4, 6));
//        System.out.println(evenlySpaced(4,6,2));
//        System.out.println(evenlySpaced(4, 6,3));
//
//        System.out.println();
//
//        int[] dummyFalse = {1,2,3,4,9};
//        int[] dummyTrue = new int []{9,0};
//        System.out.println(arrayFront9(new int[]{1, 2, 9, 3, 4}));
//        System.out.println(arrayFront9(dummyFalse));
//        System.out.println(arrayFront9(dummyTrue));
//
//        System.out.println();
//        System.out.println(foundIntTwice(new ArrayList<>(List.of(5,7,9,5,11)), 5));
//        System.out.println(foundIntTwice(new ArrayList<>(List.of(6,8,10,11,13)), 8));
//        System.out.println(foundIntTwice(new ArrayList<>(List.of(9,23,44,2,88,44)), 44));
//
//        System.out.println();
//        System.out.println(countXX("xxxx"));
//
//        System.out.println();
//        System.out.println(factorial(4));
//
//        System.out.println();
//        System.out.println(array2List(new String[]{"a", "b", "c"}));

//        System.out.println();
//        System.out.println(Arrays.toString(fizzBuzz()));

        System.out.println();
        System.out.println(Arrays.toString(fibonacci()));

        System.out.println();
        System.out.println(Arrays.toString(primeFactors(667)));


    }


        public static boolean evenlySpaced(int a, int b, int c){
            int[] order = {a, b, c};

            Arrays.sort(order);

            return order[1] - order[0] == order[2] - order[1];
        }

    public static boolean arrayFront9(int [] nums){
        int[] front4 = Arrays.copyOfRange(nums, 0, 4);
        for (int i = 0; i < front4.length; i++) {
            if (front4[i] == 9){
                return true;
            }
        } return false;
    }

    public static boolean foundIntTwice(List<Integer> nums, int value){
        int count = 0;

        for(int i =0; i < nums.size(); i++){
            if(nums.get(i).equals(value)){
                count++;
            }
        }

        return count >= 2;
    }

    public static int countXX(String str) {
        char[] letters = str.toCharArray();
        int count = 0;
        for (int i = 0; i < letters.length - 1; i++) {
            if (letters[i] == 'x' && letters[i + 1] == 'x') {
                count++;
            }
        }
        return count;
    }

    public static boolean array123(int[] nums){
        for(int i = 0; i < nums.length-2; i++){
            if (nums[i] == 1 && nums[i+1] == 2 && nums[i+2] == 3){
                return true;
            }
        } return false;
    }

    public List<String> no4LEtterWords(String[] strings){
        List<String>four = new ArrayList<>();

        for(int i = 0; i < strings.length; i++){
            if (strings[i].length() == 4){
                four.add(strings[i]);
            }
        } return four;
    }

    public int sumOdds(){
        int sum = 0;
        for(int i = 1; i < 100; i+=2){
            sum += i;
        } return sum;
    }

    public static int factorial(int n) {
        int sum = 1;

        for (int i = 1; i <= n; i++) {
            sum *= i;
        }


        return sum;
    }

    public boolean hasBad(String str){
        return str.substring(0,4).contains("bad");
    }

    public String frontTimes(String str, int n){
        if (str.length() < 3){
            return str.repeat(n);
        } else{
            return str.substring(0,3).repeat(n);
        }
    }

    public String reverseString(String str){
        String x = "";
        for(int i = str.length()-1; i >= 0; i--){
            x = x.concat(String.valueOf(str.charAt(i)));
        } return x;
    }

    public String[] list2Array(List<String> strings){
        String[] library = new String[strings.size()];
        //strings.toArray(library);
        for(int i = 0; i < strings.size(); i++){
            library[i] = strings.get(i);
        }
        return library;
    }

    public static List<String> array2List(String[] strings){
        return Arrays.asList(strings);
    }

    public int[] makeMiddle(int[] nums){
        int[] two = new int[2];
//        for (int i = ((nums.length / 2) - 1); i < (nums.length/2); i++) {
//            two[0] = nums[i];
//            two[1] = nums[i+1];
//        }
        two[0] = nums[(nums.length / 2) - 1];
        two[1] = nums[nums.length / 2];
        return two;
    }

    public static String[] fizzBuzz(){
        String[] fb = new String[100];

        for(int i = 1; i <= 100; i++){
            if (i % 3 == 0 && i % 5 == 0){
                fb[i-1] = "FizzBuzz";
            } else if (i % 3 == 0){
                fb[i-1] = "Fizz";
            } else if (i%5==0){
                fb[i-1] = "Buzz";
            } else {
                fb[i-1] = Integer.toString(i);
            }
        } return fb;

    }

    public static int[] fibonacci(){
        int b = 1;

        List<Integer> fibs = new ArrayList<>();
        fibs.add(b);

        for(int i = 1; i < 2000;){
            int fibbonacci = b + i;
            b = i;
            fibs.add(i);
            i = fibbonacci;
        }

        int[] array = new int[fibs.size()];
        for (int j = 0; j < fibs.size(); j++) {
            array[j] = fibs.get(j);
        }

        return array;
    }

    public static int[] primeFactors(int n) {
        List<Integer> factors = new ArrayList<>();

        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }

        int[] primeFactors = new int[factors.size()];
        for (int i = 0; i < factors.size(); i++) {
            primeFactors[i] = factors.get(i);
        }

        return primeFactors;
    }

}
