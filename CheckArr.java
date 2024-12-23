import java.util.Scanner;

public class CheckArr {
    public static void checkarray(int[] arr, int[] nums, int i) {

        int n = arr.length;
        int m = nums.length;
        if (n != m) {
            System.out.println("false");
        }
        if(i>=n)
        {
            System.out.println("True");
        }
        if (arr[i] != nums[i]) {
            System.out.println("false");
            

        } else {
            System.out.println("True");

        }
        checkarray(arr, nums, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size:");
        int n = sc.nextInt();

        int[] input1 = new int[n];
        System.out.println("enter arr 1:");
        for (int i = 0; i < n; i++) {
            input1[i] = sc.nextInt();
        }
        int[] input2 = new int[n];
        System.out.println("enter arr 2:");

        for (int i = 0; i < n; i++) {
            input2[i] = sc.nextInt();
        }
        checkarray(input1, input2, 0);
        sc.close();
    }

}
