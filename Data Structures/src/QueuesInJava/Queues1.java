package QueuesInJava;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;


public class Queues1{
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);

        reverse(queue);

        System.out.println(queue);
    }

    public static void reverse(Queue<Integer> queue){
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty()){
            stack.push(queue.remove());
        }
        while (!stack.isEmpty()){
            queue.add(stack.pop());
        }
    }
}

// enqueue is adding an element to last of the queue -> O(1)  add, offer
// dequeue is removing an element from first of the queue -> O(1)  remove
// peek is for getting the item in tht front -> O(1) peek
// isEmpty -> O(1)
// isFull -> O(1)