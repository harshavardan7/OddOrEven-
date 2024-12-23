import java.util.Scanner;

public class CountOddEleMatrix {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.println("Enter Size:");
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];
        System.out.println("Enter the arr:");
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++){

            arr[i][j] = scanner.nextInt();

            }
        }
        int count=0;
        for (int i = 0; i < n; i++) {
            
            for (int j = 0; j < n; j++){

            if(arr[i][j]%2==1){
                count++;
            }

            }
        }
        System.out.println(count);

    }
    
}
