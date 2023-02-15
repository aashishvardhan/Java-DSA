package HashMaps;

import java.util.HashMap;
import java.util.Map;

public class FirstRepeatedChar {
    public char charFinder2(String str){
        Map<Character, Integer> hashmap = new HashMap<>();
        
        var chars = str.toCharArray();
        for (var ch : chars){
            var count = hashmap.containsKey(ch) ? hashmap.get(ch) : 0;
            hashmap.put(ch, count + 1);
        }

        for (var ch : chars) {
            if (hashmap.get(ch) > 1){
                return ch;
            }
        }

        return Character.MAX_VALUE;
    }
}
