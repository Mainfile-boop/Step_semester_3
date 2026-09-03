package Step_semester_3.src.main.java.Session4.class_problems;

import java.util.Scanner;

public class ContainsDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean duplicate = false;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    duplicate = true;
                    break;
                }
            }

            if (duplicate) {
                break;
            }
        }

        if (duplicate) {
            System.out.println("Array contains duplicate elements.");
        } else {
            System.out.println("Array does not contain duplicate elements.");
        }
    }
}
