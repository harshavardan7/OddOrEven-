
import java.util.Scanner;

public class SumEleArrRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Array Element:");
        System.out.println(printArraySum(array, 0));

        scanner.close();
    }

    public static int printArraySum(int[] arr, int i) {
        if (i >= arr.length) {
            return 0;
        }
        return arr[i] + printArraySum(arr, i + 1);
    }
}