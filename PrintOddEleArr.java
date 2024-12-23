
import java.util.Scanner;

public class PrintOddEleArr {
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
        printArray(array, 0);
        scanner.close();
    }

    public static void printArray(int[] arr, int i) {
        if (i > arr.length) {
            return;
        }
        if (i % 2 != 0) {
            System.out.println(arr[i]);
        }

        printArray(arr, i + 1);
    }
}