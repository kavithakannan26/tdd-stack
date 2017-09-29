package com.tdd.stack;

import org.junit.Test;

import static org.hamcrest.core.Is.*;
import static org.junit.Assert.*;

public class StackTest {

    @Test
    public void shouldGetEmptyStackSize() throws Exception {
        final Stack<Integer> stack = new Stack<>();
        assertThat(stack.size(), is(0));
        assertThat(stack.storedStack.size(), is(0));
    }

    @Test
    public void shouldPushOne() throws Exception {
        final Stack<Integer> stack = new Stack<>();
        stack.push(1);
        assertThat(stack.storedStack.size(), is(1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void shouldPopOne() throws Exception {
        final Stack<Integer> stack = new Stack<>();
        stack.pop();
    }

    @Test
    public void shouldPushTwo() throws Exception {
        final Stack<Integer> stack = new Stack<>();
        stack.push(2);
        stack.push(4);
        assertThat(stack.storedStack.size(), is(2));
    }

    @Test
    public void shouldPop() throws Exception {
        final Stack<Integer> stack = new Stack<>();
        stack.push(2);
        stack.push(5);
        final int valuePopped = stack.pop();
        assertThat(stack.storedStack.size(), is(1));
        assertThat(valuePopped, is(5));

    }

    @Test
    public void shouldPeekOne() throws Exception {
        final Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(7);
        final int valuePeeked = stack.peek();
        assertThat(valuePeeked, is(7));
    }

    @Test
    public void shouldSayIsEmpty() throws Exception {
        final Stack<Integer> stack = new Stack<>();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void shouldSayIsNotEmpty() throws Exception {
        final Stack<Integer> stack = new Stack<>();
        stack.push(986);
        assertFalse(stack.isEmpty());
    }

    @Test
    public void shouldPeekString() throws Exception {
        final Stack<String> stack = new Stack<>();
        stack.push("Apple");
        final String valuePeeked = stack.peek();
        assertThat(valuePeeked, is("Apple"));
    }
}
