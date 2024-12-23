import java.util.*;

class MatrixTraveseAlternate {
    public void printAlternatelyElements(int[][] mat,int m,int n) {
        
        for(int i=0;i<m;i++){
        if(i%2==0){
            for(int j=0;j<n;j++){
                System.out.print(mat[i][j]+" ");
            }
        }
        else{
            for(int j=n-1;j>=0;j--){
                System.out.print(mat[i][j]+" ");
            }
        }
        }
    }

   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n;
        m = sc.nextInt();
        n = sc.nextInt();

        int[][] mat = new int[m][n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                mat[i][j] = sc.nextInt();
                MatrixTraveseAlternate Obj = new MatrixTraveseAlternate();

        Obj.printAlternatelyElements(mat,m,n);

        sc.close();
    }
}


