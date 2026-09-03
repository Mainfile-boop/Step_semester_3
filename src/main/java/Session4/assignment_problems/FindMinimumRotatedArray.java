package Step_semester_3.src.main.java.Session4.assignment_problems;

import java.util.Scanner;

public class FindMinimumRotatedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int left = 0;
        int right = n - 1;

        // Binary search
        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] > arr[right]) {
                // Minimum is on the right side
                left = mid + 1;
            } else {
                // Minimum is at mid or on the left side
                right = mid;
            }
        }

        System.out.println("Minimum element = " + arr[left]);
    }
}
