package org.example.array.array1d;

import java.util.Arrays;

public class ArrayDeclaration {

    public static void main(String[] args) {
        System.out.println(arrayDeclaration());
        System.out.println(arrayDeclarationAndAllocation());
        System.out.println(arrayDeclarationAndInitialization());
        System.out.println(arrayOfObject());
    }

    public static String arrayDeclaration() {
        int[] array; // array declaration without initialization
        array = new int[10]; // allocate a new array with 10 elements
        array[0] = 1;  // assign first element with value 1

        return "Array Declaration: " + Arrays.toString(array);
    }

    public static String arrayDeclarationAndAllocation() {
        int[] array = new int[10]; // allocate a new array with 10 elements
        array[0] = 1;  // assign first element with value 1

        return "Array Declaration and Allocation: " + Arrays.toString(array);
    }

    public static String arrayDeclarationAndInitialization() {
        // int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // is the same as below
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // init array with 10 elements

        return "Array Declaration and Initialization: " + Arrays.toString(array);
    }

    public static String arrayOfObject() {
        Person[] persons = {
                new Person(),
                new Person("Anna"),
                new Person("John", 18, 1),
        };

        return "Array of Object: " + Arrays.toString(persons);
    }
}
