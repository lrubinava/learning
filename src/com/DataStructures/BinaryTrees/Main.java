package com.DataStructures.BinaryTrees;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        //testDepthFirstTraverse();
        testNextGreater();
    }

    //===================== depth first traverse (in order)
    public static void depthFirstTraverse(Node tree) {

        if (tree == null) {
            return;
        }

        depthFirstTraverse(tree.left);
        System.out.print(tree.key + " ");
        depthFirstTraverse(tree.right);
    }

    public static void testDepthFirstTraverse() {

        Node root = createTree();

        depthFirstTraverse(root);
        System.out.println();
        breadthFirstTraverse(root);
        System.out.println();
        System.out.println(findNode(root, 25));
        System.out.println(findNodeRecursive(root, 7));

    }

    public static Node createTree() {
        Node root = new Node(10);
        root.left = new Node(5);
        root.left.left = new Node(1);
        root.left.right = new Node(7);
        root.left.right.left = new Node(6);

        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(30);
        root.right.right.left = new Node(25);
        root.right.right.right = new Node(40);

        return root;
    }

    //================== breadth first traverse
    public static void breadthFirstTraverse(Node tree) {
        Queue<Node> q = new LinkedList<Node>();

        q.add(tree);
        while (!q.isEmpty()) {
        Node current = q.poll();
        System.out.print(current.key + " ");
            if (current.left != null) {
                q.add(current.left);
            }
            if (current.right != null) {
                q.add(current.right);
            }
        }
    }

    //================== find if there is a node with a given value
    public static boolean findNode(Node tree, int target) {
        Node current = tree;
        if (current == null) {
            return false;
        }
        if (current.key == target) {
            return true;
        }
        while (current != null) {
            if (target < current.key) {
                current = current.left;
            }
            if (target > current.key) {
                current = current.right;
            }
            else if (current.key == target) {
                return true;
            }
        }
        return false;
    }

    public static boolean findNodeRecursive(Node tree, int target) {

        if (tree == null) {
            return false;
        }

        if (tree.key == target) {
            return true;
        }

        if (target < tree.key) {
            return findNodeRecursive(tree.left, target);
        }
        return findNodeRecursive(tree.right, target);
    }

    //================== given a number, find next greater node
    public static int findNextGreater(Node tree, int target) {

        if (tree == null) {
            return -1;
        }

        if (target < tree.key) {
            int candidate = findNextGreater(tree.left, target);
            return candidate == -1 ? tree.key : candidate;
        }

        return findNextGreater(tree.right, target);
    }

    public static void testNextGreater() {
        Node root = new Node(10);
        System.out.println(findNextGreater(root, 4));

        root = createTree();
        System.out.println(findNextGreater(root, 3));
        System.out.println(findNextGreater(root, 45));
        System.out.println(findNextGreater(root, 26));
    }



    // ================= remove a given node

//    public static Node removeNode(Node tree, int target) {
//
//    if (tree == null) {
//        return;
//    }
//
//
//
//    }

    public static Node findMinNode(Node tree) {
        if (tree.left == null) {
            return tree;
        }
        else {
            return findMinNode(tree.left);
        }
    }

}