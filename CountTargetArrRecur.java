import java.util.Scanner;

public class CountTargetArrRecur {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Enter the target value:");
        int target = scanner.nextInt();

        int count = Count(array, 0, target, 0);
        System.out.println("Target value " + target + " occurs " + count + " times in the array.");

        scanner.close();
    }

    public static int Count(int[] arr, int i, int target, int count) {
        if (i >= arr.length) {
            return count;
        }
        if (arr[i] == target) {
            count++;
        }
        return Count(arr, i + 1, target, count);
    }
}
