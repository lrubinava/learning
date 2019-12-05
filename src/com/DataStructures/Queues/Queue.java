package com.DataStructures.Queues;

public class Queue {

    private int queue[];
    private int size;
    private int total;
    private int rear;
    private int front;

    public Queue() {
        size = 100;
        total = 0;
        rear = 0;
        front = 0;
        queue = new int [size];
    }

    public Queue(int size) {
        this.size = size;
        total = 0;
        rear = 0;
        front = 0;
        queue = new int [this.size];
    }

    //isFull
    public boolean isFull() {
        return (size == total);
    }

    //enueue
    public boolean enqueue(int item) {
        if(!isFull()) {
            total++;
            queue[rear] = item;
            rear++;
            return true;
        } else {
            return false;
        }
    }

    //isEmpty
    public boolean isEmpty() {
        return (total == 0);
    }

    //dequeue
    public int dequeue() {
        if(!isEmpty()) {
            int item = queue[front];
            total--;
            front++;
            return item;
        } else {
            return -1;
        }
    }
}