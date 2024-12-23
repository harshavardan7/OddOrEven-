import java.util.Scanner;

public class CommonEleArr {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array1: ");
        int n = scanner.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        System.out.println("Enter the elements of the array1:");
        for (int i = 0; i < n; i++) {
            arr1[i] = scanner.nextInt();
        }
        System.out.print("Enter the number of elements in the array2: ");
        int m = scanner.nextInt();
        System.out.println("Enter the elements of the array2:");
        for (int i = 0; i < n; i++) {
            arr2[i] = scanner.nextInt();
        }
        int s = 0;
        int e = 0;
        while (s < n && e < m) {
            if (arr1[s] == arr2[e]) {
                System.out.println("Common Element:");
                System.out.println(arr1[s]);
                s++;
                e++;
            } else if (arr1[s] < arr2[e]) {
                s++;
            } else {
                e++;
            }
        }
    }

}
