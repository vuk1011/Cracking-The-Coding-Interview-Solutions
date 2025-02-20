/**
 * Question 1.7
 * Rotate Matrix: Given an image represented by an NxN matrix, where each pixel in the image is 4
 * bytes, write a method to rotate the image by 90 degrees. Can you do this in place?
 */

package arrays_and_strings.rotate_matrix;

class Solution1 {
    /*
    Assumptions made:
    the rotation is clockwise
    the matrix has to be a square matrix
     */
    static boolean rotateMatrix(int[][] matrix) {
        if (matrix.length == 0 || matrix.length != matrix[0].length) return false;

        /*
        We will transform the matrix layer by layer, like:
        1 1 1 1 1
        1 2 2 2 1
        1 2 3 2 1
        1 2 2 2 1
        1 1 1 1 1
         */
        int n = matrix.length;
        for (int i = 0; i < n / 2; i++) { // number of layers = n/2
            /*
            Layer's elements can be divided into 4 sides that don't overlap, like:
            1 1 2
            4   2
            4 3 3
             */
            for (int j = 0; j < n - 2 * i - 1; j++) { // number of elements in one side of the layer = n - 2i - 1
                /*
                For each element of 1 side of a layer, 4 movements are needed, between corresponding positions, like:
                1 2 3 1
                3     2
                2     3
                1 3 2 1

                The coordinates of the elements that should switch are, by sides, determined by i, j, n:
                U U U R
                L     R
                L     R
                L D D D
                UP     ->  ( i , i+j )
                RIGHT  ->  ( i+j , n-1-i )
                DOWN   ->  ( n-1-i , n-1-i-j )
                LEFT   ->  ( n-1-i-j , i )

                These should switch values like:
                UP -> RIGHT -> DOWN -> LEFT -> UP
                 */
                int tmp = matrix[i][i + j]; // let's save the upper one
                matrix[i][i + j] = matrix[n - 1 - i - j][i]; // up = left
                matrix[n - 1 - i - j][i] = matrix[n - 1 - i][n - 1 - i - j]; // left = down
                matrix[n - 1 - i][n - 1 - i - j] = matrix[i + j][n - 1 - i]; // down = right
                matrix[i + j][n - 1 - i] = tmp; // right = up
            }
        }
        return true;
    }
}
