package org.example;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        SpiralMatrix sp = new SpiralMatrix();
        int n = 8;

        int[][] matrix = sp.getSpiralMatrix(n, true);
        printMatrix(matrix);

        System.out.println("===========================");

        matrix = sp.getSpiralMatrix(n, false);
        printMatrix(matrix);
    }

    private static void printMatrix(int[][] matrix) {
        IntStream.range(0, matrix.length).forEach(i -> {
            IntStream.range(0, matrix.length).forEach(j -> System.out.printf("%02d ", matrix[j][i]));
            System.out.println();
        });

    }
}