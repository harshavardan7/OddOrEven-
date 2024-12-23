import java.util.Scanner;

public class Stairs {
    public static int f(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return f(n - 1) + f(n - 2);

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of steps: ");

        int n = scanner.nextInt();

        int result = f(n);

        System.out.println("Number of ways to climb " + n + " steps: " + result);

        scanner.close();
    }

}
