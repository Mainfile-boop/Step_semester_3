package Step_semester_3.src.main.java.Session4.class_problems;

import java.util.Scanner;

public class BestTimeToBuySellStock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of days: ");
        int n = sc.nextInt();

        int[] prices = new int[n];

        System.out.println("Enter stock prices:");
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < n; i++) {
            // Calculate profit if stock is sold today
            int profit = prices[i] - minPrice;

            if (profit > maxProfit) {
                maxProfit = profit;
            }

            // Update minimum buying price
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
        }

        System.out.println("Maximum Profit = " + maxProfit);
    }
}
    

