
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapSquareNum {
    public static Map<Integer, Integer> squareNumbers(int[] numbers) {
        Map<Integer, Integer> squareMap = new HashMap<>();
        for (int num : numbers) {
            squareMap.put(num, num * num);
        }
        return squareMap;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numbers separated by spaces: ");
        String input = scanner.nextLine();
        String[] numStrings = input.split(" ");
        int[] numbers = new int[numStrings.length];
        for (int i = 0; i < numStrings.length; i++) {
            numbers[i] = Integer.parseInt(numStrings[i]);
        }

        Map<Integer, Integer> result = squareNumbers(numbers);
        for (Map.Entry<Integer, Integer> entry : result.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}