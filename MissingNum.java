
import java.util.Scanner;

class MissingNum {
    public int missingNumber(int[] nums) {
        int res = nums.length;

        for (int i = 0; i < nums.length; i++) {
            res += i - nums[i];
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the numbers separated by spaces:");
        String input = scanner.nextLine();

        String[] inputStrings = input.split("\\s+");

        int[] nums = new int[inputStrings.length];
        for (int i = 0; i < inputStrings.length; i++) {
            try {
                nums[i] = Integer.parseInt(inputStrings[i]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid number format: " + inputStrings[i]);
                scanner.close();
                return;
            }
        }

        MissingNum solution = new MissingNum();
        int missingNumber = solution.missingNumber(nums);

        System.out.println("The missing number is: " + missingNumber);

        scanner.close();
    }
}
