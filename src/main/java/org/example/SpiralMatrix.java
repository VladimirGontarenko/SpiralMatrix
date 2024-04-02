package org.example;

import java.util.stream.IntStream;

public class SpiralMatrix {

    public int[][] getSpiralMatrix(int n, boolean reverse) {
        int [][] matrix = new int[n][];
        IntStream.range(0, n).forEach(i -> matrix[i] = new int[n]);

        int x = 0;
        int y = 0;
        int z = n;
        int m = n/2-1;
        for (int i = 0, j = n * n; i < j;i++) {
            matrix[x][y] = m;/*reverse ? j - i++ : ++i;*/
            if (x < z + (n - z) / 2 - 1 && y == (n - z) / 2) {
                x++;
            } else if (x == z + (n - z) / 2 - 1 && y < z + (n - z) / 2 - 1) {
                y++;
            } else if (x > (n - z) / 2 && y == z + (n - z) / 2 - 1) {
                x--;
            } else if (x == (n - z) / 2 && y > (n - z) / 2 + 1) {
                y--;
            } else {
                x++;
                z -= 2;
                m--;
            }

        }

        return matrix;
    }
}
