//Matrix Addition
public class MatrixElementWise {
    public static void main(String[] args) {
        int[][] A = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] B = {
                {7, 8, 9},
                {10, 11, 12}
        };

        int rows = A.length;
        int cols = A[0].length;
        int[][] C = new int[rows][cols];

        // Element-wise addition
        TODO

                // Print result matrix
                TODO
    }
}

//Transpose Matrix
public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] A = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int rows = A.length;
        int cols = A[0].length;
        int[][] T = new int[cols][rows];

        // Transpose logic
        TODO

        // Print transposed matrix
        System.out.println("Transposed Matrix:");
        TODO
    }
}

//Matrix Multiplication
public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] A = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] B = {
                {7, 8},
                {9, 10},
                {11, 12}
        };

        // Result matrix
        int rowsA = A.length;       // Number of rows in A
        int colsA = A[0].length;   // Number of columns in A
        int colsB = B[0].length;   // Number of columns in B
        int[][] C = new int[rowsA][colsB];

        // Matrix multiplication
        TODO

        // Print result matrix
        System.out.println("Result Matrix:");
        for (int[] row : C) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();

