package org.example.exception;

class MyException extends RuntimeException {
    public MyException(String message) {
        super(message);
    }
}

public class ThrowExample {
    public static int lengthOfString(String s) throws MyException {
        if (s == null) {
            throw new MyException("string can not be null");
        }
        return s.length();
    }

    public static void main(String[] args) {
        String s = null;
        try {
            int length = lengthOfString(s);
            System.out.println(length);
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}
