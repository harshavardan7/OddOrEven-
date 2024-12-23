import java.util.Scanner;

public class RecurFact {
    public static int Fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * Fact(n - 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num to Fact:");
        int n = sc.nextInt();
        System.out.println(Fact(n));
        sc.close();

    }

}
