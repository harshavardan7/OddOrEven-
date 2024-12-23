import java.util.Scanner;

public class ReverseMatrixByRow {

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
        System.out.println("Reverse By Row:");
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j >= 0; j--) {
                System.out.print(mat[i][j]);
            }
            System.out.println();
        }

        scanner.close();

    }

}
