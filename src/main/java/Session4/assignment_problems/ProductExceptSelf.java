package Step_semester_3.src.main.java.Session4.assignment_problems;

import java.util.Scanner;

public class ProductExceptSelf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int[] result = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Calculate product for each element
        for (int i = 0; i < n; i++) {
            int product = 1;

            for (int j = 0; j < n; j++) {
                if (i != j) {
                    product = product * arr[j];
                }
            }

            result[i] = product;
        }

        System.out.println("Product of array except self:");

        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
