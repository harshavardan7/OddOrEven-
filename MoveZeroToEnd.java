
import java.util.Scanner;
import java.util.Arrays;

class MoveZeroToEnd {
    public void moveZeroes(int[] nums) {
        int m = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[m];
                nums[m] = temp;
                m++;
            }
        }
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

        MoveZeroToEnd solution = new MoveZeroToEnd();
        solution.moveZeroes(nums);

        System.out.println("Array after moving zeroes:");
        System.out.println(Arrays.toString(nums));

        scanner.close();
    }
}
