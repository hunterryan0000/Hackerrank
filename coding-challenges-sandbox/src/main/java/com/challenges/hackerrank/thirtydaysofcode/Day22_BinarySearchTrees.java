package com.challenges.hackerrank.thirtydaysofcode;

import java.util.Scanner;

public class Day22_BinarySearchTrees {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static void main(String[] args) {
        //he height of a tree is the number of edges between the root node and its furthest leaf.
        // More technically put, it's 1 + max(height(leftSubtree), height(rightSubtree)) (i.e., one more than the maximum of the heights of its left and right subtrees)
        //Any node has a height of 1, and the height of an empty subtree is -1.

        Scanner scanner = new Scanner(System.in);

        // Read the number of nodes in the tree
        int n = scanner.nextInt();

        // Read the values and construct the binary search tree
        Node root = null;
        for (int i = 0; i < n; i++) {
            int data = scanner.nextInt();
            root = insert(root, data);
        }

        // Calculate the height of the binary search tree
        int height = getHeight(root);

        System.out.println(height);

        scanner.close();

    }
    public static int getHeight(Node root){
        if(root ==null){
            return -1;
        } else {
            return 1 + Math.max(getHeight(root.left), getHeight(root.right));
        }
    }

    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            if (data <= root.data) {
                root.left = insert(root.left, data);
            } else {
                root.right = insert(root.right, data);
            }
            return root;
        }
    }
}
