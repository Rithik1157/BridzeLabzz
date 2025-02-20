
import java.util.Scanner;

public class Repeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.println("Enter the text");
        String text = sc.nextLine();

        char result = findNonRepeating(text);

        if (result != ' ') {
            System.out.println("First non-repeating character in the text is: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }


    public static char findNonRepeating(String text) {
        int[] frequency = new int[256]; 

        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        for (int i = 0; i < text.length(); i++) {
            if (frequency[text.charAt(i)] == 1) {
                return text.charAt(i);
            }
        }

        return ' '; 
    }
}