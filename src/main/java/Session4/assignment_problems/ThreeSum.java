package Step_semester_3.src.main.java.Session4.assignment_problems;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Sort the array
        Arrays.sort(arr);

        System.out.println("Triplets whose sum is 0:");

        boolean found = false;

        for (int i = 0; i < n - 2; i++) {

            // Skip duplicate elements
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];

                if (sum == 0) {
                    System.out.println(
                        "[" + arr[i] + ", " + arr[left] + ", " + arr[right] + "]"
                    );

                    found = true;

                    // Skip duplicates
                    while (left < right && arr[left] == arr[left + 1]) {
                        left++;
                    }

                    while (left < right && arr[right] == arr[right - 1]) {
                        right--;
                    }

                    left++;
                    right--;

                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        if (!found) {
            System.out.println("No triplets found.");
        }
    }
}
