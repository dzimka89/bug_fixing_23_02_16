package com.bugs.null_pointer_exceptions;

import java.util.Arrays;

public class ArrayTest2 {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = 1;
            }
        }

         //implements yours output according to the next style
        for (int i = 0; i < matrix.length; i++) {
            for (int k = 0; k < (i+1) ; k++) {
                System.out.print(matrix[i][k] + " ");
            }
            System.out.println();
        }

//        System.out.println();
//
//        for(int[] matrix_ : matrix){
//            System.out.println(Arrays.toString(matrix_));
//        }

    }
}
/*
[1]
[1, 1]
[1, 1, 1]
[1, 1, 1, 1]
[1, 1, 1, 1, 1]
 */