
import java.util.Scanner;

public class RecurPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();
        printNum(start, end);
        sc.close();
    }

    public static void printNum(int current, int end) {
        if (current > end) {
            return;
        }
        System.out.print(current + " ");

        printNum(current + 1, end);
    }
}