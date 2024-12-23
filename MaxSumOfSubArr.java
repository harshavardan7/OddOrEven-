
import java.util.Scanner;
import java.util.Arrays;

class MaxSumOfSubArr {
    public int maxSubArray(int[] nums) {
        int res = nums[0];
        int total = 0;

        for (int n : nums) {
            if (total < 0) {
                total = 0;
            }

            total += n;
            res = Math.max(res, total);
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        MaxSumOfSubArr solution = new MaxSumOfSubArr();
        int maxSum = solution.maxSubArray(nums);

        System.out.println("The maximum sum of a contiguous subarray is: " + maxSum);

        scanner.close();
    }
}
