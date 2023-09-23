package org.example.string;

public class SubString {

    public static void main(String[] args) {
        String s = "Hello, world!";

        System.out.println(s.substring(1, 5)); // index: 5 -> index 4
        System.out.println(s.substring(5)); // index: 5 -> end
    }
}
