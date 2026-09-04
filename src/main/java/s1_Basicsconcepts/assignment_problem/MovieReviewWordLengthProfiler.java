package Step_semester_3.src.main.java.s1_Basicsconcepts.assignment_problem;

import java.util.Scanner;

public class MovieReviewWordLengthProfiler {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the movie review: ");
        String review = sc.nextLine();

        // Remove extra spaces and split into words
        String[] words = review.trim().split("\\s+");

        int totalLength = 0;
        String shortestWord = words[0];
        String longestWord = words[0];

        for (String word : words) {

            // Remove punctuation
            word = word.replaceAll("[^a-zA-Z]", "");

            totalLength += word.length();

            if (word.length() < shortestWord.length()) {
                shortestWord = word;
            }

            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        double averageLength = (double) totalLength / words.length;

        System.out.println("\n--- Movie Review Analysis ---");
        System.out.println("Total Words: " + words.length);
        System.out.println("Shortest Word: " + shortestWord);
        System.out.println("Longest Word: " + longestWord);
        System.out.printf("Average Word Length: %.2f%n", averageLength);

        sc.close();
    }
}
