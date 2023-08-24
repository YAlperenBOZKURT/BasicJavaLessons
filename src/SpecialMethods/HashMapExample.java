package SpecialMethods;

import java.util.HashMap;

public class HashMapExample {
    /*     HashMap:
  put(key, value): Add a specific key-value pair.
  get(key): Retrieve the value associated with a given key.
  remove(key): Delete a specific key-value pair.
  containsKey(key): Check if a certain key exists in the map.
  keySet(): Obtain all keys as a Set.
  values(): Obtain all values as a Collection.  */

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("apple", 5);
        map.put("banana", 3);
        map.put("orange", 2);
        int value = map.get("apple");
        map.remove("banana");
        boolean containsKey = map.containsKey("banana");
        System.out.println("Value of apple: " + value);
        System.out.println("Contains banana key: " + containsKey);
        System.out.println(map.values());
        System.out.println(map.keySet());
    }
}
