package arrays_and_strings.rotate_matrix;

public class Test {
    public static void main(String[] args) {
        int[][] test1 = {{1, 1, 1, 1}, {2, 2, 2, 2}, {3, 3, 3, 3}, {4, 4, 4, 4}};
        System.out.println("Before rotation:");
        printMatrix(test1);
        Solution1.rotateMatrix(test1);
        System.out.println("After rotation:");
        printMatrix(test1);

        int[][] test2 = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};
        System.out.println("Before rotation:");
        printMatrix(test2);
        Solution1.rotateMatrix(test2);
        System.out.println("After rotation:");
        printMatrix(test2);

        int[][] test3 = {{1, 2}, {3, 4}};
        System.out.println("Before rotation:");
        printMatrix(test3);
        Solution1.rotateMatrix(test3);
        System.out.println("After rotation:");
        printMatrix(test3);
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
