package org.example.exception;

public class MultipleException {
    public static void main(String[] args) {
        String[] numbers = new String[]{"Hello", "123", "456", null};
        int result = stringToInteger(numbers);
    }

    public static int stringToInteger(String[] s) {
        int result = 0;
        try {
            result = Integer.parseInt(s[5]);
        } catch (NumberFormatException e) {
            System.out.print("Error parsing string to integer\n");
        } catch (NullPointerException e) {
            System.out.print("Null pointer access");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.print("Index out of bounds");
        }

        return result;
    }
}
