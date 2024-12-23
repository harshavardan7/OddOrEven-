import java.util.Scanner;

class Solution {
    public static int Find_Equilibrium_Index(int[] nums) {
        int n=nums.length;
        int tsum=0;
        for(int i=0;i<n;i++){
            tsum+=nums[i];
        }
        int lsum=0;
        for(int i=0;i<n;i++){
            int rsum=tsum-lsum-nums[i];
            if(lsum==rsum){
                return i;
            }
            lsum+=nums[i];

        }
        return -1;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int res=Solution.Find_Equilibrium_Index(arr);
        System.out.println(res);
        

    }
}