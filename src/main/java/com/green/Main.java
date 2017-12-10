package com.green;


/**
 *
 */
public class Main {
    public static void main(String[] args) {
        stackTest();
        queueTest();
        setTest();
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

    private static void setTest() {
        IntSet set1 = new IntSet();
        set1.add(1);
        set1.add(2);
        set1.add(2);
        set1.add(3);
        set1.add(5);

        IntSet set2 = new IntSet();
        set2.add(1);
        set2.add(2);
        set2.add(2);
        set2.add(0);
        set2.add(4);

        set1.intersect(set2).printElementsTo(System.out);
        System.out.println("--------------");
        set1.union(set2).printElementsTo(System.out);
    }
}
