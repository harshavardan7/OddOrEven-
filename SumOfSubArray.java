import java.util.Scanner;

public class SumOfSubArray {
    public static void printsubarr(int[] arr, int n) {
        int maxsum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                    sum += arr[k];

                }
                System.out.println();
                System.out.println("sumof sub arr:" + sum);
                maxsum = Math.max(maxsum, sum);
                System.out.println("MaxSum=" + maxsum);

            }
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("The subarrays are:");
        printsubarr(arr, n);

        scanner.close();
    }
}
