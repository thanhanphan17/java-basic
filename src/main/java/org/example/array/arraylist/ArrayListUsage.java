package org.example.array.arraylist;

import java.util.ArrayList;


public class ArrayListUsage {

    public static void main(String[] args) {
        // generic
        ArrayList<Object> arrayList = new ArrayList<>();

        // add elements
        arrayList.add(3.14);
        arrayList.add("Hello");
        arrayList.add(10);
        arrayList.add('A');
        arrayList.add(true);

        System.out.println("Array List: " + arrayList);
        System.out.println("First Element: " + arrayList.get(0));

        // set element at index 0 equal to 3.15
        arrayList.set(0, 3.15);

        // remove element at index 1
        arrayList.remove(1);

        // for each element
        System.out.println("For each ArrayList:");
        for (Object element : arrayList) {
            System.out.println(element.toString());
        }

    }
}
