package Step_semester_3.src.main.java.Session4.assignment_problems;

import java.util.Scanner;

public class SubarraySumK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter K: ");
        int k = sc.nextInt();

        int count = 0;

        // Check all possible subarrays
        for (int i = 0; i < n; i++) {
            int sum = 0;

            for (int j = i; j < n; j++) {
                sum = sum + arr[j];

                if (sum == k) {
                    count++;
                }
            }
        }

        System.out.println("Number of subarrays with sum " + k + " = " + count);
    }
}
