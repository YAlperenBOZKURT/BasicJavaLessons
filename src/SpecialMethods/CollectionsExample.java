package SpecialMethods;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(8);
        Collections.sort(list);
        System.out.println("Shorted list: " + list);
        Collections.reverse(list);
        System.out.println("Reversed list: " + list);
        Collections.shuffle(list);
        System.out.println("Shuffled list: " + list);
    }
}
