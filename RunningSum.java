import java.util.*;

class Solution {
    public static int[] SumArray(int[] a){
        int n=a.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=a[i];
            a[i]=sum;
        }
        return a;

    }

}

public class RunningSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] input = new int[n];
        

        for (int i = 0; i < n; i++) {
            input[i] = sc.nextInt();
        }
        int [] arr=(Solution.SumArray(input));

        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i]+" ");
    }
}
