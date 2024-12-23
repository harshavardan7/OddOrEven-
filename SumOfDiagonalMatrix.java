
import java.util.Scanner;

public class SumOfDiagonalMatrix {

    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int dsum = 0;
        for (int i = 0; i < n; i++) {
            dsum += mat[i][i];
            if (i != (n - 1 - i)) {
                dsum += mat[i][n - 1 - i];
            }
        }
        return dsum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the matrix (n x n):");
        int n = scanner.nextInt();

        int[][] mat = new int[n][n];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = scanner.nextInt();
            }
        }

        SumOfDiagonalMatrix solution = new SumOfDiagonalMatrix();
        int result = solution.diagonalSum(mat);

        System.out.println("The sum of the diagonals is: " + result);

        scanner.close();
    }
}
