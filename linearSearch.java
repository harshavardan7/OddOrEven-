import java.util.Scanner;

public class linearSearch {

    public static int linearSearch(int[] arr, int key) {    
        for (int i = 0; i < arr.length; i++) {    
            if (arr[i] == key) {    
                return i;    
            }    
        }    
        return -1;    
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the key to search for: ");
        int key = sc.nextInt();

        int result = linearSearch(arr, key);

        if (result == -1) {
            System.out.println("Key not found in the array.");
        } else {
            System.out.println("Key found at index: " + result);
        }
    }
}
