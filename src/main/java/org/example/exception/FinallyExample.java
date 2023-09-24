package org.example.exception;

public class FinallyExample {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("finally block is always executed");
        }
    }
}
