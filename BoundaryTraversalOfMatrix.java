import java.util.*;

public class BoundaryTraversalOfMatrix{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n;
        
        m = sc.nextInt();
        n = sc.nextInt();
        int[][] matrix = new int[m][n];
        
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = sc.nextInt();

        printboundaryTraversal(m, n, matrix);
        sc.close();
    }

    public static void printboundaryTraversal(int m, int n, int[][] mat) {
    for(int j=0;j<n;j++){
        System.out.print(mat[0][j]+" ");
    }
    for(int i=1;i<m;i++){
        System.out.print(mat[i][n-1]+" ");
    }
    for(int j=n-2;j>=0;j--){
        System.out.print(mat[m-1][j]+" ");
    }
    for(int i=m-2;i>=1;i--){
        System.out.print(mat[i][0]+" ");
    }
       
    }

}