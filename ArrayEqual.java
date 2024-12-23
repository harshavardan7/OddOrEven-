import java.util.Scanner;

public class ArrayEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size:");
        int n = sc.nextInt();

        int[] input1 = new int[n];
        System.out.println("enter arr 1:");
        for (int i = 0; i < n; i++) {
            input1[i] = sc.nextInt();
        }
        int[] input2 = new int[n];
        System.out.println("enter arr 2:");

        for (int i = 0; i < n; i++) {
            input2[i] = sc.nextInt();
        }
        int m1 = input1.length;
        int m2 = input2.length;

        if (m1 != m2) {
            System.out.println("false");

        }
        for (int i = 0; i < n; i++) {
            if (input1[i] != input2[i]) {
                System.out.println("false");

            }

        }
        System.out.println("True");

        sc.close();
    }
}
