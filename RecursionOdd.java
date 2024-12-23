import java.util.Scanner;

public class RecursionOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        printOdd(start, end);
    }

    public static void printOdd(int current, int end) {
        if (current > end) {
            return;
        }
        if (current % 2 != 0) {
            System.out.print(current + " ");
        }

        printOdd(current + 1, end);
    }
}
