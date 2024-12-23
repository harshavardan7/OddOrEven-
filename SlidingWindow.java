import java.util.Scanner;

public class SlidingWindow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.print("Enter the size of the sliding window: ");
        int k = scanner.nextInt();

        scanner.close();

        if (k > n) {
            System.out.println("Window size cannot be greater than the size of the array.");
            return;
        }

        int maxSum = maxSumSubarray(nums, k);
        System.out.println("Maximum sum of subarray of size " + k + " is: " + maxSum);
    }

    public static int maxSumSubarray(int[] nums, int k) {
        int maxSum = 0;
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }
        maxSum = windowSum;

        for (int i = k; i < nums.length; i++) {
            windowSum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }
}
