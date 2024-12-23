import java.util.Scanner;

public class LastDigit {
    public static void PrintDigit(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n % 10);
        PrintDigit(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        PrintDigit(s);

        sc.close();

    }
}
