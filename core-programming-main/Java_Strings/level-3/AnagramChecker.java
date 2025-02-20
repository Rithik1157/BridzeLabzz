import java.util.Scanner;
import java.util.Arrays;

public class AnagramChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first text:");
        String text1 = sc.nextLine();
        System.out.println("Enter second text:");
        String text2 = sc.nextLine();

        boolean result = isAnagram(text1, text2);
        System.out.println("The texts are " + (result ? "anagrams." : "not anagrams."));
    }

    public static boolean isAnagram(String text1, String text2) {
        if (text1.length() != text2.length()) {
            return false;
        }

        int[] frequency1 = new int[256];
        int[] frequency2 = new int[256];

        for (int i = 0; i < text1.length(); i++) {
            frequency1[text1.charAt(i)]++;
            frequency2[text2.charAt(i)]++;
        }

        return Arrays.equals(frequency1, frequency2);
    }
}
