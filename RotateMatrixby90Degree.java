
import java.io.*;
import java.util.*;

class Solution {
    public void rotateMatrixBy90(int[][] mat, int row, int col) {
        int[][] result = new int[row][col];

        // Perform the rotation
        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < col; ++j) {
                result[j][row - 1 - i] = mat[i][j];
            }
        }

        // Copy the result back to mat
        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < col; ++j) {
                mat[i][j] = result[i][j];
            }
        }
    }
}

public class RotateMatrixby90Degree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Row:");
        int n = sc.nextInt();
        System.out.println("Enter Col:");
        int m = sc.nextInt();

        int[][] mat = new int[n][m];
        System.out.println("Enter Matrix:");

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                mat[i][j] = sc.nextInt();
            }
        }

        Solution Obj = new Solution();
        Obj.rotateMatrixBy90(mat, n, m);
        System.out.println("Rotated matrix:");

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();

    }
}