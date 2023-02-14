package QueuesInJava;

import java.util.PriorityQueue;

public class PriorityQueue1 {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(5);
        queue.add(1);
        queue.add(4);
        queue.add(2);
        queue.add(3);

        while (!queue.isEmpty()){
            System.out.println(queue.remove());
        }
    }
}

// priority queues can be implemented using both Arrays and Heaps
