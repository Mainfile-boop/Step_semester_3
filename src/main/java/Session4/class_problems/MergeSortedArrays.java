package Step_semester_3.src.main.java.Session4.class_problems;

import java.util.Scanner;

public class MergeSortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();

        int[] a = new int[n1];

        System.out.println("Enter elements of first sorted array:");
        for (int i = 0; i < n1; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();

        int[] b = new int[n2];

        System.out.println("Enter elements of second sorted array:");
        for (int i = 0; i < n2; i++) {
            b[i] = sc.nextInt();
        }

        int[] merged = new int[n1 + n2];

        int i = 0, j = 0, k = 0;

        // Merge both arrays
        while (i < n1 && j < n2) {
            if (a[i] <= b[j]) {
                merged[k] = a[i];
                i++;
            } else {
                merged[k] = b[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of first array
        while (i < n1) {
            merged[k] = a[i];
            i++;
            k++;
        }

        // Copy remaining elements of second array
        while (j < n2) {
            merged[k] = b[j];
            j++;
            k++;
        }

        System.out.println("Merged sorted array:");
        for (int x = 0; x < merged.length; x++) {
            System.out.print(merged[x] + " ");
        }
    }
}
