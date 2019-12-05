package com.DataStructures.Arrays;

// How to rotate a pic 90 degrees using 2D matrix

public class Main {
    public static void main(String[] args) {

        testRotateTwoDimensionalArray();
    }


    public static void testRotateTwoDimensionalArray() {

        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        printMatrix(matrix);
        System.out.println();
        int[][] result = rotate90(matrix);
        printMatrix(result);

    }
    public static int[][] rotate90(int[][] matrix) {

        int[][] result = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
               result[j][matrix.length - i - 1] = matrix[i][j];


            }
        }
        return result;
    }

    public static void printMatrix(int [][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

}