package SpecialMethods;

import java.util.HashSet;

public class HashSetExample {
    /* **HashSet**:
   - `add(element)`: Bir öğeyi küme koleksiyonuna ekle.
   - `remove(element)`: Belirli bir öğeyi kümeden sil.
   - `contains(element)`: Belirli bir öğenin kümede olup olmadığını kontrol et. */

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("apple");
        set.add("banana");
        boolean containsElement = set.contains("apple");
        set.remove("banana");
        System.out.println("Contains apple: " + containsElement);
    }
}
