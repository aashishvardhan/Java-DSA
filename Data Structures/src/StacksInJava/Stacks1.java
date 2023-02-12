package StacksInJava;

import java.util.Stack;

public class Stacks1 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        var top = stack.pop();
        System.out.println(top);
        top = stack.peek();
        System.out.println(top);
        System.out.println(stack);

    }
}

// push(item) -> O(1)
// pop() -> O(1)
// peek() -> O(1)
// isEmpty() -> O(1)

// The functions that we use in stack are peek(), push(), pop(), empty() and search().