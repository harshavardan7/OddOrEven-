import java.util.Scanner;

public class RecurTargetInArr {
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

        if (Target(array, 0, target)) {
            System.out.println("Target value " + target + " is in the array.");
        } else {
            System.out.println("Target value " + target + " is not in the array.");
        }

        scanner.close();
    }

    public static boolean Target(int[] arr, int i, int target) {
        if (i >= arr.length) {
            return false;
        }
        if (arr[i] == target) {
            return true;
        }
        return Target(arr, i + 1, target);
    }
}
