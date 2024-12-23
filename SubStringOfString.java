
import java.util.Scanner;

class SubStringOfString {
    public static void printAllSubstrings(String str) {
        int length = str.length();
        for (int start = 0; start < length; start++) {

            for (int end = start + 1; end <= length; end++) {

                String substring = str.substring(start, end);
                System.out.println(substring);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        System.out.println("All substrings of the given string are:");
        printAllSubstrings(input);

        scanner.close();
    }
}
