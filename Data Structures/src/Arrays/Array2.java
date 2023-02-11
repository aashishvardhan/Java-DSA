package Arrays;

import java.util.ArrayList;

public class Array2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20);
        list.add(20);
        list.remove(0);
        System.out.println(list);
        System.out.println(list.indexOf(20));
        System.out.println(list.lastIndexOf(20));
    }
}

// We have 2 implementations of dynamic arrays in Java. Vector and ArrayList.
// Vector Class increases its size by 100% Everytime it gets full - All methods are Synchronized. 
// ArrayList Class increases its size by 50% Everytime it gets full. - Methods are not Synchronized.

// In arraylist we have add, remove, indexOf, lastIndexOf, contains, size, toArray etc functions