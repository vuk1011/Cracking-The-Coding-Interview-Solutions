/**
 * Question 1.8
 * Zero Matrix: Write an algorithm such that if an element in an MxN matrix is 0, its entire row and
 * column are set to 0.
 */

package arrays_and_strings.zero_matrix;

class Solution1 {
    static void setZeros(int[][] matrix) {
        // let's store information about which rows and columns should be 0s
        boolean[] rows = new boolean[matrix.length];
        boolean[] cols = new boolean[matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    rows[i] = true;
                    cols[j] = true;
                }
            }
        }

        for (int i = 0; i < rows.length; i++) {
            if (rows[i]) setRowToZero(matrix, i);
        }
        for (int i = 0; i < cols.length; i++) {
            if (cols[i]) setColumnToZero(matrix, i);
        }
    }

    private static void setRowToZero(int[][] matrix, int row) {
        for (int i = 0; i < matrix[0].length; i++) {
            matrix[row][i] = 0;
        }
    }

    private static void setColumnToZero(int[][] matrix, int column) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][column] = 0;
        }
    }
}
