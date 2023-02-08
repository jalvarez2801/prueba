package test.jc;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {
        // Create a HashMap to store strings
        Map<String, String> map = new HashMap<>();

        // Add some key-value pairs to the map
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");

        // Search for a value in the map
        String value = map.get("key2");
        System.out.println(value); // prints "value2"
    }
}

