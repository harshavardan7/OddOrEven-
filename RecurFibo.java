import java.util.Scanner;

public class RecurFibo {
    public static int Fibo(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return Fibo(n - 1) + Fibo(n - 2);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num to Fact:");
        int n = sc.nextInt();
        System.out.println(Fibo(n));
        sc.close();

    }

}
