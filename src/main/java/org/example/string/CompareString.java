package org.example.string;

public class CompareString {

    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "Hello";

        compareUseEqual(s1, s2);
        compareUseCompareTo(s1, s2);
    }

    public static void compareUseEqual(String s1, String s2) {
        if (s1.equals(s2)) {
            System.out.printf("Equals methods: %s == %s\n", s1, s2);
        } else {
            System.out.printf("Equals methods: %s != %s\n", s1, s2);
        }

        if (s1.equalsIgnoreCase(s2)) {
            System.out.printf("EqualsIgnoreCase methods: %s == %s\n", s1, s2);
        } else {
            System.out.printf("EqualsIgnoreCase methods:  %s != %s\n", s1, s2);
        }
    }

    public static void compareUseCompareTo(String s1, String s2) {
        if (s1.compareTo(s2) == 0) {
            System.out.printf("Compare methods: %s == %s\n", s1, s2);
        } else if (s1.compareTo(s2) < 0) {
            System.out.printf("Compare methods: %s < %s\n", s1, s2);
        } else if (s1.compareTo(s2) > 0) {
            System.out.printf("Compare methods: %s > %s\n", s1, s2);
        }
    }
}
