package com.green;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 */
public class IntSet {
    private Integer[] elements = new Integer[0];

    public void add(Integer element) {
        if (!contains(element)) {
            elements = Arrays.copyOf(elements, elements.length + 1);
            elements[elements.length - 1] = element;
            Arrays.sort(elements);
        }
    }

    public boolean contains(Integer element) {
        int x = 0;
        int y = 1;
        for (Integer a : elements) {
            if (Objects.equals(a, element)) {
                return true;
            }
        }
        return false;
    }

    public IntSet intersect(IntSet other) {
        IntSet newSet = new IntSet();

        for (Integer a : elements) {
            for (Integer b : other.elements) {
                if (a.equals(b)) {
                    newSet.add(a);
                    break;
                }
            }
        }

        return newSet;
    }

    public IntSet union(IntSet other) {
        IntSet newSet = new IntSet();

        for (Integer a : elements) {
            newSet.add(a);
        }
        for (Integer a : other.elements) {
            newSet.add(a);
        }

        return newSet;
    }

    public void printElementsTo(PrintStream printer) {
        for (Integer a : elements) {
            printer.println(a);
        }
    }
}
