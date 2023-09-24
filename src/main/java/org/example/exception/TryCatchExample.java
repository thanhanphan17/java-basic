package org.example.exception;

import java.io.FileWriter;
import java.io.IOException;

/*
    - A try block may have many catch blocks
    - Catch blocks only use after a try block
 */
public class TryCatchExample {
    public static void main(String[] args) {
        demo1();
        demo2();
    }

    public static void demo1() {
        try {
            int a = 10;
            int b = 0;
            System.out.println(a / b); // throw an exception, stop the rest of try block
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.print("The rest of code ...");
    }

    public static void demo2() {
        try {
            FileWriter fw = new FileWriter("output.txt"); // CheckedException
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
