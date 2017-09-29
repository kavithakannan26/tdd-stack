package com.tdd.stack;

import java.util.ArrayList;

class Stack<T> {

    ArrayList<T> storedStack = new ArrayList<>();

    int size() {
        return this.storedStack.size();
    }

    void push(final T i) {
        this.storedStack.add(i);
    }

    T pop() {
        if (this.storedStack.size() == 0)
        {
            throw new IndexOutOfBoundsException();
        }
        final int i = this.storedStack.size();
        return this.storedStack.remove(i-1);

    }

    T peek() {
        return this.storedStack.get(this.storedStack.size()-1);
    }

    boolean isEmpty() {
        return this.storedStack.isEmpty();
    }
}
