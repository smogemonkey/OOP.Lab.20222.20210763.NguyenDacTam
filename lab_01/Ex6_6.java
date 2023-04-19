import java.util.Arrays;
import java.util.Scanner;

public class Ex6_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /* matrix with size mxn */
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int[][] matrix1 = new int[m][n];
        int[][] matrix2 = new int[m][n];
        int[][] sumMatrix = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        for (int[] row : sumMatrix) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println();
        scanner.close();
    }
}
