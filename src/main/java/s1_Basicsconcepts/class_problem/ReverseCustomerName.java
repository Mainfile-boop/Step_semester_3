package Step_semester_3.src.main.java.s1_Basicsconcepts.class_problem;

import java.util.Scanner;

public class ReverseCustomerName {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String name = sc.nextLine();

        String reverse = "";

        // Reverse the name
        for (int i = name.length() - 1; i >= 0; i--) {
            reverse = reverse + name.charAt(i);
        }

        System.out.println("Original Name: " + name);
        System.out.println("Reversed Name: " + reverse);

        sc.close();
    }
}
