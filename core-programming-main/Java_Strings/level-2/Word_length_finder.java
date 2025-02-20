
import java.util.Scanner;

public class Word_length_finder {

    public static String[] splitText(String text) {
        int n = text.length();
        String[] words = new String[n]; 
        int wordCount = 0;
        StringBuilder word = new StringBuilder();

        for (int i = 0; i < n; i++) {
            char ch = text.charAt(i);
            if (ch != ' ') {
                word.append(ch);
            } else if (word.length() > 0) {
                words[wordCount++] = word.toString();
                word.setLength(0);
            }
        }
        if (word.length() > 0) {
            words[wordCount++] = word.toString();
        }
        String[] finalWords = new String[wordCount];
        System.arraycopy(words, 0, finalWords, 0, wordCount);
        return finalWords;
    }

    public static int findLength(String word) {
        int count = 0;
        for (char c : word.toCharArray()) {
            count++;
        }
        return count;
    }

    public static String[][] getWordLengths(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i]; // Store word
            result[i][1] = String.valueOf(findLength(words[i])); // Store length as string
        }
        return result;
    }

    public static void displayResults(String[][] data) {
        System.out.println("\nWord\t\tLength");
        System.out.println("-------------------");
        for (String[] row : data) {
            System.out.println(row[0] + "\t\t" + Integer.parseInt(row[1])); // Convert back to integer
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the text: ");
        String text = scanner.nextLine();

        String[] words = splitText(text);

        String[][] results = getWordLengths(words);

        displayResults(results);

        scanner.close(); 
    }
}
