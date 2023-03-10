package LinkedLists;

import java.util.NoSuchElementException;

public class LinkedList {

    private class Node {    
        private int value;
        private Node next;
        
        public Node(int value){
            this.value = value;
        }
    }

    private Node first;
    private Node last;
    private int size;

    // addFirst
    public void addFirst(int item){
        var node = new Node(item);

        if (isEmpty()){
            first = node;
            last = node;
        }
        else{
            node.next = first;
            first = node;
        }
        size++;
    }

    // addLast
    public void addLast(int item){
        var node = new Node(item);

        if (isEmpty()){
            first = node;
            last = node;
        }
        else{
            last.next = node;
            last = node;
        }
        size++;
    }

    // deleteFirst
    public void deleteFirst(){
        if (first == null){
            throw new NoSuchElementException();
        }

        if (first == last){
            first = null;
            last = null;
            size = 0;
            return;
        }

        var second = first.next;
        first.next = null;
        first = second;

        size--;
    }

    // deleteLast
    public void deleteLast(){
        if (first == null){
            throw new NoSuchElementException();
        }

        if (first == last){
            first = null;
            last = null;
            size = 0;
            return;
        }

        var previous = getPrevious(last);
        last = previous;
        last.next = null;

        size--;
    }

    // contains
    public boolean contains(int item){
        return indexOf(item) != -1;
    }

    // indexOf
    public int indexOf(int item){
        int index = 0;
        var current = first;
        while (current != null){
            if (current.value == item){
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    // size
    public int size(){
        return size;
    }

    // toArray
    public int[] toArray(){
        var current = first;
        var index = 0;
        int[] array = new int[size];
        while (current != null){
            array[index++] = current.value;
            current = current.next;
        }
        return array;
    }

    // reverse
    public void reverse(){
        if (isEmpty()) return;

        var previous = first;
        var current = previous.next;
        while (current != null){
            var next = current.next;
            current.next = previous;
            previous = next;
            current = next;
        }

        last = first;
        last.next = null;
        first = previous;
    }

    // getKthFromTheEnd
    public int getKthFromTheEnd(int k){
        if (isEmpty()){
            throw new IllegalStateException();
        }
        
        var a = first;
        var b = first;

        for (int i = 0; i < k - 1; i++){
            b = b.next;
            if (b == null){
                throw new IllegalArgumentException();
            }
        }

        while (b != null){
            a = a.next;
            b = b.next;
        }
        return a.value;
    }

    // getPrevious
    private Node getPrevious(Node node){
        var current = first;
        while (current != null){
            if (current.next == node){
                return current;
            }
            current = current.next;
        }
        return null;
    }

    // isEmpty
    private boolean isEmpty() {
        return first == null;
    }
}
