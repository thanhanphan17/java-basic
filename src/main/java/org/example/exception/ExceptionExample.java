package org.example.exception;

/*
    - Checked/Unchecked exceptions
 */
public class ExceptionExample {
    public static void main(String[] args) {
        int ans = divide(10, 0); // ArithmeticException, UncheckedException

        // FileWriter fw = new FileWriter("output.txt"); // CheckedException
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}
