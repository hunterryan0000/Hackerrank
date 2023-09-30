package com.challenges.hackerrank.thirtydaysofcode;

import java.util.Scanner;

public class Day13_AbstractClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();

        Book book = new MyBook(title,author,price);

        book.display();

    }

   static abstract class Book{
        private String title;
        private String author;
        private int price;

        public Book(String title, String author, int price) {
            this.title = title;
            this.author = author;
            this.price = price;
        }

        void display(){
            System.out.println("Title: " + this.title);
            System.out.println("Author: " + this.author);
            System.out.println("Price: " + this.price);
        }
    }

    static class MyBook extends Book{
        public MyBook(String title, String author, int price){
            super(title,author,price);
        }

        @Override
        void display() {
            super.display();
        }
    }

}
