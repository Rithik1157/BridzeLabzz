import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.println("Enter the text");
        String text = sc.nextLine();

        System.out.println("Is the text a palindrome (Iterative)? " + isPalindrome(text));
        System.out
                .println("Is the text a palindrome (Recursive)? " + isPalindromeRecursive(text, 0, text.length() - 1));
        System.out.println("Is the text a palindrome (Using Char Array)? " + isPalindromeCharArray(text));
    }

    public static boolean isPalindrome(String text) {
        int start = 0, end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    public static boolean isPalindromeCharArray(String text) {
        char[] original = text.toCharArray();
        char[] reverse = reverseString(text).toCharArray();

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reverse[i]) {
                return false;
            }
        }
        return true;
    }

    public static String reverseString(String text) {
        String reverse = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reverse += text.charAt(i);
        }

        return reverse;
    }
}