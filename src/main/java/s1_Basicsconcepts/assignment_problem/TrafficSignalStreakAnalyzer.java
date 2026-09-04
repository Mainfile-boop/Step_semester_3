package Step_semester_3.src.main.java.s1_Basicsconcepts.assignment_problem;

import java.util.Scanner;

public class TrafficSignalStreakAnalyzer {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of signals: ");
        int n = sc.nextInt();

        char[] signals = new char[n];

        System.out.println("Enter signals (R = Red, Y = Yellow, G = Green):");

        for (int i = 0; i < n; i++) {
            signals[i] = sc.next().charAt(0);
        }

        int currentStreak = 1;
        int longestStreak = 1;
        char longestSignal = signals[0];

        for (int i = 1; i < n; i++) {

            if (signals[i] == signals[i - 1]) {
                currentStreak++;
            } else {
                currentStreak = 1;
            }

            if (currentStreak > longestStreak) {
                longestStreak = currentStreak;
                longestSignal = signals[i];
            }
        }

        String signalName;

        if (longestSignal == 'R') {
            signalName = "Red";
        } else if (longestSignal == 'Y') {
            signalName = "Yellow";
        } else {
            signalName = "Green";
        }

        System.out.println("\n--- Result ---");
        System.out.println("Longest Signal: " + signalName);
        System.out.println("Longest Streak: " + longestStreak);

        sc.close();
    }
}
