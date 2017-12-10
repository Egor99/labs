package com.green;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        stackTest();
        queueTest();
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

    private static void queueTest() {
        Queue<Integer> queue = new Queue<>();

        queue.add(10);
        queue.add(11);
        queue.add(12);
        queue.add(13);
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
    }
}
