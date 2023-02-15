package HashMaps;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {
    public static void main(String[] args) {
        // EmployeeNumber -> Integer
        // Name -> String

        Map<Integer, String> hashmap = new HashMap<>();
        hashmap.put(1, "Aashish");
        hashmap.put(2, "Vardhan");
        hashmap.put(1, "Sai");
        hashmap.put(1, "Paruvada");

    }
}

// map is an Interface and HashMap is an implementation of the Interface
// we have methods like put(), remove(), get(), containsKey() -> O(1), containsValue() -> O(n)
// we have functions like entrySet() and keySet() that returns set of key-value pairas and set
// of keys respectively.

// for objects in entrySet() we have methods like getValue(), getKey(), setValue() etc.