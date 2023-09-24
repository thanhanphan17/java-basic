package org.example.collection;

import java.util.HashSet;
import java.util.Iterator;

/*
    HashSet is not ordering
    Each element appears only one time
 */
public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("One");
        hashSet.add("Two");
        hashSet.add("Three");
        hashSet.add("Four");
        hashSet.add("Five");
        hashSet.add("One");

        printHashSet(hashSet);
    }

    public static void printHashSet(HashSet<String> hashSet) {
        Iterator<String> iter = hashSet.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
