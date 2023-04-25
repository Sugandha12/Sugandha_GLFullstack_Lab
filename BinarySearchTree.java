package com.gl.lab3.question2;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class BinarySearchTree {

    Node root;

    BinarySearchTree(Node root) {
        this.root = root;
    }

    public Node insert(Node root, int k) {
        Node newNode = new Node(k);
        if (root == null) {
            root = newNode;
            this.root = root; // binary search tree root in constructor
            return root;
        }

        Node parent = null;
        Node temp = root;
        while (temp != null) {
            parent = temp;
            if (temp.data == k) {
                System.out.println("Node" + k + " already exists");
                return root;
            } else if (k < temp.data) {
                temp = temp.left;
            } else {
                temp = temp.right;
            }
        }

        if (k < parent.data) {
            parent.left = newNode;
        } else if (k > parent.data) {
            parent.right = newNode;
        }
        this.root = root; // bst root in constructor
        return root;
    }

    public void inorder(Node root) {

        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public void findPair(Node root, int sum) {

        Set<Integer> set = new HashSet<Integer>();
        System.out.println("Sum = " + sum);
        if (!getPairRecursive(root, sum, set)) {
            System.out.println("No pairs found");
        }
    }

    public boolean getPairRecursive(Node root, int sum, Set<Integer> set) {
        boolean pairFound = false;
        if (root == null) {
            return false;
        }

        boolean leftPairFound = getPairRecursive(root.left, sum, set);
        boolean rightPairFound = getPairRecursive(root.right, sum, set);

        if (set.contains(sum - root.data)) {
            System.out.println("Pair is: " + "(" + (sum - root.data) + "," + root.data + ")");
            pairFound = true;
        }
        set.add(root.data);
        return pairFound || leftPairFound || rightPairFound;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = { 40, 20, 60, 10, 30, 50, 70 };

        Node root = null;

        BinarySearchTree bst = new BinarySearchTree(root);

        for (int i = 0; i < arr.length; i++) {
            root = bst.insert(root, arr[i]);
        }
        // System.out.println("IN ORDER TRAVERSAL => ");
        // bst.inorder(root);

        int sum = 130;
        bst.findPair(root, sum);

        sc.close();

    }

}

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
