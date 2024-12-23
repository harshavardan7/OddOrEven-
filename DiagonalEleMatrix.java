import java.util.Scanner;

public class DiagonalEleMatrix {

    public static void Printdiagonal(int mat[][]) {
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            System.out.println("Left Diagonal:" + mat[i][i]);
        }
        System.out.println();
        int m = 0;
        for (int i = n - 1; i >= 0; i--) {
            System.out.println(" Right Diagonal:" + mat[m][i]);
            m++;
        }
        System.out.println();
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

        System.out.println("Diagonal elements of the matrix are:");
        Printdiagonal(mat);

        scanner.close();
    }

}