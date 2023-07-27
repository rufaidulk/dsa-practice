/**
 * Brute force.
 * Won't work if the input matrix consists -1
/*
class Solution {
    public void setZeroes(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    this.markAsNegative(matrix, i, j);
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    private void markAsNegative(int[][] matrix, int row, int col) {
        int i = row;
        while (++i < matrix.length && matrix[i][col] != 0) {
            matrix[i][col] = -1;
        }
        i = row;
        while (--i >= 0 && matrix[i][col] != 0) {
            matrix[i][col] = -1;
        }

        i = col;
        while (--i >= 0 && matrix[row][i] != 0) {
            matrix[row][i] = -1;
        }

        i = col;
        while (++i < matrix[row].length && matrix[row][i] != 0) {
            matrix[row][i] = -1;
        }
    }
}
