package org.example.array2d;

public class ArrayDeclaration {

    public static void main(String[] args) {
        printMatrix(arrayDeclaration());
        System.out.println("--------------------------------");
        printMatrix(arrayDeclarationAndAllocation());
        System.out.println("--------------------------------");
        printMatrix(arrayDeclarationAndInitialization());
    }

    public static int[][] arrayDeclaration() {
        int[][] array; // array declaration without initialization
        array = new int[3][3]; // allocate a new array with 3x3 elements
        array[0] = new int[]{1, 1, 1};  // assign first row with value (1, 1, 1)
        array[1] = new int[]{2, 2, 2};  // assign first row with value (1, 1, 1)
        array[2] = new int[]{3, 3, 3};  // assign first row with value (1, 1, 1)

        return array;
    }

    public static int[][] arrayDeclarationAndAllocation() {
        int[][] array = new int[3][3]; // allocate a new array with 10 elements
        array[0] = new int[]{1, 1, 1};  // assign first row with value (1, 1, 1)

        return array;
    }

    public static int[][] arrayDeclarationAndInitialization() {
        return new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
    }

    public static void printMatrix(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
