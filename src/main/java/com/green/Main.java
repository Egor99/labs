package com.green;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        stackTest();
    }

    private static void stackTest() {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(3);
        stack.push(2);
        stack.push(200);
        stack.push(100);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
