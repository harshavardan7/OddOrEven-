import java.util.Scanner;

public class RecursionReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();
        printNum(end, start);
    }

    public static void printNum(int current, int start) {
        if (current < start) {
            return;
        }

        System.out.print(current + " ");
        printNum(current - 1, start);
    }
}
