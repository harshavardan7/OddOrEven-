import java.util.*;

class Solution {
    static int solve(int size, int arr[]) {
        int c=0;
        for(int i=0;i<size;i++){
            if(arr[i]==1){
                c++;
            }
        }
        return c;
    }

}

public class Count1InSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int array[] = new int[n];

        for(int i=0; i<n; i++){
            array[i]= sc.nextInt();
        }
        Solution Obj = new Solution();
        System.out.println(Obj.solve(n,array));
    }
}