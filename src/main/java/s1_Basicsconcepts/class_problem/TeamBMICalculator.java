package Step_semester_3.src.main.java.s1_Basicsconcepts.class_problem;

import java.util.Scanner;

public class TeamBMICalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of team members: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println("\n--- Team Member " + i + " ---");

            System.out.print("Enter name: ");
            String name = sc.next();

            System.out.print("Enter weight (kg): ");
            double weight = sc.nextDouble();

            System.out.print("Enter height (meters): ");
            double height = sc.nextDouble();

            // BMI formula
            double bmi = weight / (height * height);

            System.out.printf("Name: %s%n", name);
            System.out.printf("BMI: %.2f%n", bmi);

            // BMI Category
            if (bmi < 18.5) {
                System.out.println("Category: Underweight");
            }
            else if (bmi < 25) {
                System.out.println("Category: Normal weight");
            }
            else if (bmi < 30) {
                System.out.println("Category: Overweight");
            }
            else {
                System.out.println("Category: Obese");
            }
        }

        sc.close();
    }
}
