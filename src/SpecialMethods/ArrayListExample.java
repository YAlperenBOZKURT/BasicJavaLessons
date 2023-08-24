package SpecialMethods;

import java.util.ArrayList;

public class ArrayListExample {

    /* ArrayList:
    add(element): Add an element to the collection.
    get(index): Get the element at a specific index.
    remove(index): Remove the element at a specific index.
    size(): Return the number of elements in the collection. */

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        String element = list.get(0);
        list.remove(1);
        int size = list.size();
        System.out.println("Element at index 0: " + element);
        System.out.println("Size of the list: " + size);
    }
}
