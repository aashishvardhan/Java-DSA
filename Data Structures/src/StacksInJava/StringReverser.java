package StacksInJava;

import java.util.Stack;

public class StringReverser {
    public String reverse(String input){
        if (input == null){
            throw new IllegalArgumentException();
        }

        Stack<Character> stack = new Stack<>();

        for (char i : input.toCharArray()){
            stack.push(i);
        }
        StringBuffer reversed = new StringBuffer();
        while (!stack.empty()){
            reversed.append(stack.pop());
        }
        return reversed.toString();
    }
}
