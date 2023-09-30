package com.challenges.hackerrank.thirtydaysofcode;

import java.util.Scanner;

public class Day12_Inheritance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] firstLine = line.trim().split(" ");

//        String name = "Name: " + firstLine[1] + ", " + firstLine[0];
//        String id = "ID: " + firstLine[2];

        int n = scanner.nextInt();
        scanner.nextLine(); // Move to the next line

        String scoreLine = scanner.nextLine();
        String[] stringScores = scoreLine.trim().split(" ");
        int[] scores = new int[stringScores.length];

        for (int i = 0; i < scores.length; i++) {
            scores[i] = Integer.parseInt(stringScores[i]);
        }

        Student student = new Student(firstLine[0], firstLine[1], Integer.parseInt(firstLine[2]), scores);

        System.out.println("Name: " + student.lastName + ", " + student.firstName);
        System.out.println("ID: " + student.idNumber);
        System.out.println("Grade: " + student.calculate());
    }

    static class Student {
        private String firstName;
        private String lastName;
        private int idNumber;
        private int[] scores;

        public Student(String firstName, String lastName, int idNumber, int[] scores) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.idNumber = idNumber;
            this.scores = scores;
        }

        public char calculate() {
            int totalScore = 0;
            for (int score : scores) {
                totalScore += score;
            }

            int averageScore = totalScore / scores.length;
            char letterGrade;

            if (averageScore >= 90) {
                letterGrade = 'O';
            } else if (averageScore >= 80) {
                letterGrade = 'E';
            } else if (averageScore >= 70) {
                letterGrade = 'A';
            } else if (averageScore >= 55) {
                letterGrade = 'P';
            } else if (averageScore >= 40) {
                letterGrade = 'D';
            } else {
                letterGrade = 'T';
            }

            return letterGrade;
        }
    }

}
