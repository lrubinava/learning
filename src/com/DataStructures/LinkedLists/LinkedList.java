package com.DataStructures.LinkedLists;

class LinkedList {
    private Node head;

    public static class Node {
        int value;
        Node next;
    }

    public LinkedList() {
    }

    public LinkedList(int... items) {
        // TODO:
    }

    // Add item to the end of the list
    public void append(int value) {
        Node newNode = new Node();
        newNode.value = value;

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        return;
    }

    // Reverses list
    public Node reverse(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
    }

    // add item at the beginning
    public boolean add(int value) {
        Node newNode = new Node();
        newNode.value = value;
        newNode.next = head;
        head = newNode;
        return true;
    }

    //print
    public void printAll() {
        Node current = head;
        while(current != null) {
            System.out.println(current.value);
            current = current.next;
        }
    }

    //remove a Node
    public boolean remove(int value) {
        if (head.value == value) {
            head = head.next;
            return true;
        }
        else {
            Node curr = head;
            Node next = head.next;
            while (true) {
                if (next == null || next.value == value) {
                    break;
                }
                else {
                    curr = next;
                    next = next.next;
                }
            }
            if(next != null) {
                curr.next = next.next;
                return true;
            } else {
                return false;
            }
        }
    }

    // find k element from the end (version 1 - iterative)
    public Node getNthFromLast(Node head, int k) {
        int length = 0;
        Node temp = head;

        while (temp != null) {
            temp = temp.next;
            length++;
        }

        if (k > length) {
            return null;
        }
        temp = head;
        for (int i = 1; i < length - k + 1; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public Node getKthFromLast(Node head, int k) {
        Node slow = head;
        Node fast = head;

        int count = 0;
        if (head != null) {
            while (count < k) {
                if (fast == null) {
                    return fast;
                }
                fast = fast.next;
                count++;
            }
            while (fast != null) {
                slow = slow.next;
                fast = fast.next;
            }
        }
        return slow;
    }
}
