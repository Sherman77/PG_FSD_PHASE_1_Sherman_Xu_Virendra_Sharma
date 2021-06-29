package ArraysExample;

public class ArrayPlay {

    static int[][] A = new int[][]{{7, 4}, {2, 9}};
    static int[][] B = new int[][]{{1, 5}, {3, 8}};
    static int[][] C = new int[2][2];

    public static void main(String[] args) {
        helper();
    }

    static private void helper() {
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 2; col++) {
                C[row][col] = A[row][col] + B[row][col];
                System.out.println(C[row][col] + "");
            }
        }
    }
}
