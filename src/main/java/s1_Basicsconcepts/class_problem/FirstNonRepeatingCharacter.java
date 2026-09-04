package Step_semester_3.src.main.java.s1_Basicsconcepts.class_problem;

import java.util.Scanner;
import java.util.HashMap;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequency of each character
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Find the first character with frequency 1
        char result = '\0';

        for (char ch : str.toCharArray()) {
            if (map.get(ch) == 1) {
                result = ch;
                break;
            }
        }

        if (result != '\0')
            System.out.println("First non-repeating character: " + result);
        else
            System.out.println("No non-repeating character found.");

        sc.close();
    }
}
