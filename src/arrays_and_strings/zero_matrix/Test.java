package arrays_and_strings.zero_matrix;

public class Test {
    public static void main(String[] args) {
        int[][] test1 = {{1, 1, 1, 1}, {2, 2, 0, 2}, {3, 3, 3, 3}, {4, 4, 4, 4}};
        System.out.println("Before:");
        printMatrix(test1);
        Solution1.setZeros(test1);
        System.out.println("After:");
        printMatrix(test1);

        int[][] test2 = {{1, 0, 1}, {2, 2, 2}, {3, 3, 3}, {0, 4, 4}};
        System.out.println("Before:");
        printMatrix(test2);
        Solution1.setZeros(test2);
        System.out.println("After:");
        printMatrix(test2);
    }

    private static void printMatrix(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}
