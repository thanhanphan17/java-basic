package org.example.string;

public class ConcatString {

    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
        
        System.out.println(concatUseAdd(s1, s2));
        System.out.println(concatUseConcat(s1, s2));
        System.out.println(concatUseStringBuilder(s1, s2));
    }

    public static String concatUseAdd(String s1, String s2) {
        return s1 + " " + s2;
    }

    public static String concatUseConcat(String s1, String s2) {
        s1 = s1.concat(" ");
        s1 = s1.concat(s2);
        return s1;
    }

    public static String concatUseStringBuilder(String s1, String s2) {
        StringBuilder sb = new StringBuilder(s1);
        sb.append(" ");
        sb.append(s2);
        return sb.toString();
    }
}
