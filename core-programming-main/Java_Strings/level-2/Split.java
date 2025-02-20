
import java.util.Scanner;

public class Split {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        String[] words = splitWords(str);

        String[] words2 = str.split(" ");

        System.out.println("Words using built-in method: ");
        for (String word : words2) {
            System.out.println(word);
        }

        System.out.println("Words using user-defined method: ");
        for (String word : words) {
            System.out.println(word);
        }

        System.out.println("Are the words equal? " + compareWords(words, words2));
    }

    public static String[] splitWords(String str) {
        int count = 0;

        int[] spaces = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                spaces[count] = i; // Store space index
                count++; // Increment space count
            }
        }

        String[] words = new String[count + 1];

        words[0] = str.substring(0, spaces[0]);

        for (int i = 1; i < count; i++) {
            words[i] = str.substring(spaces[i - 1] + 1, spaces[i]);
        }

        words[count] = str.substring(spaces[count - 1] + 1);

        return words;
    }

    public static boolean compareWords(String[] words, String[] words2) {
        if (words.length != words2.length) {
            return false;
        }

        for (int i = 0; i < words.length; i++) {
            if (!words[i].equals(words2[i])) {
                return false;
            }
        }

        return true;
    }
}
