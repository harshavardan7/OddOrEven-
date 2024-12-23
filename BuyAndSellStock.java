
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class BuyAndSellStock {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (min > prices[i]) {
                min = prices[i];
            }

            profit = Math.max(profit, prices[i] - min);
        }

        return profit;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the prices separated by spaces:");
        String input = scanner.nextLine();

        String[] inputStrings = input.split("\\s+");

        int[] prices = new int[inputStrings.length];
        for (int i = 0; i < inputStrings.length; i++) {
            prices[i] = Integer.parseInt(inputStrings[i]);
        }

        BuyAndSellStock solution = new BuyAndSellStock();
        int profit = solution.maxProfit(prices);

        System.out.println("Maximum profit: " + profit);

        scanner.close();
    }
}
