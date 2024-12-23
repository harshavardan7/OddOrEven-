import java.util.Scanner;

public class BinarySearch {

    public static void binarySearch(int arr[], int first, int last, int key) {
        while (first <= last) { 
            int mid = (first + last) / 2; 
            if (arr[mid] < key) {
                first = mid + 1;
            } else if (arr[mid] == key) {
                System.out.println("Element is found at index: " + mid);
                return; 
            } else {
                last = mid - 1;
            }
        }
        
        System.out.println("Element is not found!");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int last = arr.length - 1;
        int key = sc.nextInt();
        binarySearch(arr, 0, last, key);
    }
}
