package Step_semester_3.src.main.java.s1_Basicsconcepts.assignment_problem;

import java.util.HashSet;
import java.util.Scanner;

public class SeatDuplicationChecker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        HashSet<Integer> seats = new HashSet<>();

        boolean duplicate = false;

        for (int i = 1; i <= n; i++) {

            System.out.print("Enter seat number for student " + i + ": ");
            int seat = sc.nextInt();

            if (seats.contains(seat)) {
                System.out.println("Duplicate seat found: " + seat);
                duplicate = true;
            } else {
                seats.add(seat);
            }
        }

        if (!duplicate) {
            System.out.println("No duplicate seats found.");
        }

        sc.close();
    }
}
