package Step_semester_3.src.main.java.s1_Basicsconcepts.class_problem;

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("=== Rock Paper Scissors Game ===");
        System.out.println("1. Rock");
        System.out.println("2. Paper");
        System.out.println("3. Scissors");

        System.out.print("Enter your choice: ");
        int userChoice = sc.nextInt();

        int computerChoice = random.nextInt(3) + 1;

        String user;
        String computer;

        if (userChoice == 1)
            user = "Rock";
        else if (userChoice == 2)
            user = "Paper";
        else if (userChoice == 3)
            user = "Scissors";
        else {
            System.out.println("Invalid choice!");
            sc.close();
            return;
        }

        if (computerChoice == 1)
            computer = "Rock";
        else if (computerChoice == 2)
            computer = "Paper";
        else
            computer = "Scissors";

        System.out.println("You chose: " + user);
        System.out.println("Computer chose: " + computer);

        if (userChoice == computerChoice) {
            System.out.println("Result: Draw!");
        }
        else if ((userChoice == 1 && computerChoice == 3) ||
                 (userChoice == 2 && computerChoice == 1) ||
                 (userChoice == 3 && computerChoice == 2)) {
            System.out.println("Result: You Win!");
        }
        else {
            System.out.println("Result: Computer Wins!");
        }

        sc.close();
    }
}
