package Step_semester_3.src.main.java.s1_Basicsconcepts.assignment_problem;

import java.util.Scanner;

public class TypingSpeedAccuracyChecker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Typing Speed Test ===");

        String originalText = "Java programming is easy to learn";

        System.out.println("Type the following sentence:");
        System.out.println(originalText);

        System.out.print("\nEnter your typed text: ");
        String typedText = sc.nextLine();

        System.out.print("Enter time taken in seconds: ");
        double seconds = sc.nextDouble();

        // Calculate typing speed
        double minutes = seconds / 60;
        double words = typedText.trim().isEmpty()
                ? 0
                : typedText.trim().split("\\s+").length;

        double wpm = words / minutes;

        // Calculate accuracy
        int correctCharacters = 0;
        int length = Math.min(originalText.length(), typedText.length());

        for (int i = 0; i < length; i++) {
            if (originalText.charAt(i) == typedText.charAt(i)) {
                correctCharacters++;
            }
        }

        double accuracy =
                ((double) correctCharacters / originalText.length()) * 100;

        System.out.println("\n--- Result ---");
        System.out.printf("Typing Speed: %.2f WPM%n", wpm);
        System.out.printf("Accuracy: %.2f%%%n", accuracy);

        sc.close();
    }
}
