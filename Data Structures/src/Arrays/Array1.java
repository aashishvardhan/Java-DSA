package Arrays;

import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;

        int[] numbers2 = {40, 50 ,60};
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.length);
        System.out.println(Arrays.toString(numbers2));

    }
}

// Arrays are Static in Java
// Lookup -> O(1)
// Copying and Inserting -> O(n)
// Deleting the last element -> O(1)
// Deleting the first element -> O(n) 
// We should delete first and move each element to its previous index so O(n)

// Directly Printing the array will print the memory address of the array. So, we use the Arrays class to
// print the content of the arrays [Arrays.toString(numbers)].

// numbers.length method is used to get the length of an array
