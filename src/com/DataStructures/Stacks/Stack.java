package com.DataStructures.Stacks;

public class Stack {

    private int top;
    private int size;
    private int stack[];

    public Stack() {
        top = -1;
        size = 50;
        stack = new int[size];
    }

    public Stack(int size) {
        top = -1;
        this.size = size;
        stack = new int[this.size];
    }

    //isFull
    public boolean isFull() {
        return (top == stack.length - 1);
    }

    //push
    public boolean push(int item) {
        if(!isFull()) {
            top++;
            stack[top] = item;
            return true;
        } else {
            return false;
        }
    }

    //isEmpty
    public boolean isEmpty() {
        return (top == -1);
    }

    //pop
    public int pop() throws Exception {
        if(!isEmpty()) {
           return stack[top--];
        }
        throw new Exception ("Stack is empty.");
    }
}
