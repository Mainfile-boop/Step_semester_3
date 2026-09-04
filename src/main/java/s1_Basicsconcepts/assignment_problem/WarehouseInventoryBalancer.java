package Step_semester_3.src.main.java.s1_Basicsconcepts.assignment_problem;

import java.util.Scanner;

public class WarehouseInventoryBalancer {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();

        String[] products = new String[n];
        int[] stock = new int[n];

        int totalStock = 0;

        // Input product details
        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter product name: ");
            products[i] = sc.next();

            System.out.print("Enter stock quantity: ");
            stock[i] = sc.nextInt();

            totalStock += stock[i];
        }

        // Calculate average stock
        double average = (double) totalStock / n;

        System.out.println("\n--- Inventory Report ---");
        System.out.println("Total Stock: " + totalStock);
        System.out.printf("Average Stock: %.2f%n", average);

        System.out.println("\nProducts below average stock:");

        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (stock[i] < average) {
                System.out.println(products[i] + " - " + stock[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No products are below average stock.");
        }

        sc.close();
    }
}
