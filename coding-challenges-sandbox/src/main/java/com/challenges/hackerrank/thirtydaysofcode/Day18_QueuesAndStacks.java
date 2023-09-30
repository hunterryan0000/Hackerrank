package com.challenges.hackerrank.thirtydaysofcode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Day18_QueuesAndStacks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        boolean isPalindrome = true;


        for (int i = 0; i < word.length(); i++) {
            pushCharacter(word.charAt(i));
            enqueueCharacter(word.charAt(i));
        }

        for (int i = 0; i < stack.size(); i++) {
            if (popCharacter() != dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome) {
            System.out.println("The word, " + word + ", is a palindrome.");
        } else{
            System.out.println("The word, " + word + ", is not a palindrome.");

        }
    }

    static Stack<Character> stack = new Stack<>();
    static Queue<Character> queue = new LinkedList<>();

    static void pushCharacter(char ch){
        stack.push(ch);
    }

    static void enqueueCharacter(char ch){
        queue.add(ch);
    }

    static  char popCharacter(){
       return stack.pop();
    }

    static char dequeueCharacter(){
        return queue.remove();
    }
}
