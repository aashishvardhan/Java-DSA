package HashMaps;

import java.util.HashSet;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        int[] arr = {1, 2, 2, 3, 4, 3, 4};

        for (var num : arr){
            set.add(num);
        }

        System.out.println(set);
    }
}

// Sets have methods like add, remove, removeAll, clear etc. We can iterate over sets 
// same as hash maps.