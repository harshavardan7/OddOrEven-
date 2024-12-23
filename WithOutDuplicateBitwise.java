import java.util.Scanner;

public class BinaryToDecimal {

    public static void main(String[] args) {
        // int a = 10;
        // int b = 20;
        // int c = 10;

        // System.out.println(a ^ b ^ c);
        // System.out.println(a << 6);
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("enter arr 1:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = arr[0];
        for (int i = 1; i < n; i++) {
            ans = ans ^ arr[i];
        }
        System.out.println(ans);

    }

}
