import java.util.Scanner;

public class SubSequenceString {
    public static void Subseq(String s, int i, String out) {
        if (i >= s.length()) {
            System.out.println(out);
            return;
        }
        Subseq(s, i + 1, out + s.charAt(i));

        Subseq(s, i + 1, out);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        System.out.println("All subsequences of the string are:");
        Subseq(input, 0, "");

        scanner.close();
    }
}
