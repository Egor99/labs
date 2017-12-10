package com.green;

import java.util.Arrays;

public class Stack<T> {
    private Object[] elements = new Object[0];

    public void push(T element) {
        elements = Arrays.copyOf(elements, elements.length + 1);
        elements[elements.length - 1] = element;
    }

    @SuppressWarnings("unchecked")
    public T peek() {
        return (T) elements[elements.length - 1];
    }

    @SuppressWarnings("unchecked")
    public T pop() {
        T result = (T) elements[elements.length - 1];
        elements = Arrays.copyOf(elements, elements.length - 1);
        return result;
    }
}
