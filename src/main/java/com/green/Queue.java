package com.green;

import java.util.Arrays;

/**
 *
 */
public class Queue<T> {
    private Object[] elements = new Object[0];

    public void add(T element) {
        elements = Arrays.copyOf(elements, elements.length + 1);
        elements[elements.length - 1] = element;
    }

    @SuppressWarnings("unchecked")
    public T peek() {
        return (T) elements[0];
    }

    @SuppressWarnings("unchecked")
    public T remove() {
        T result = (T) elements[0];
        Object[] newArray = new Object[elements.length - 1];
        System.arraycopy(elements, 1, newArray, 0, newArray.length);
        elements = newArray;
        return result;
    }
}
