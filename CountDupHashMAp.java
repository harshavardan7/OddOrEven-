import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountDupHashMAp {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                int freq = map.get(arr[i]);
                map.put(arr[i], freq + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        System.out.println("COUNT DUPLICATE:");
        System.out.println(map);

    }
}
