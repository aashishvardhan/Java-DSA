package LinkedLists;

import java.util.LinkedList;

public class LinkedList1{
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.addLast(20);
        list.addLast(10);
        list.addLast(30);
        list.addFirst(80);
        list.remove(0);
        list.removeLast();
        list.removeFirst();
        System.out.println(list);
    }
}

// LookUp by Value -> O(n)

// Inserting at the end -> O(1)
// Inserting at the Beginning -> O(1)
// Inserting at the Middle -> O(n)

// Deleting at the end -> O(n)
// Deleting at the beginning -> O(1)
// Deleting in the midddle -> O(n)

// If we don't specify the Wrapper class we can use any type of Data Type

// Methods in LinkedList are addLast, addFirst, remove, removeLast, removeFirst, contains, indexOf
// size, toArray