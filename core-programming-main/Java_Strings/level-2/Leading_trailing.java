

import java.util.Scanner;

public class Leading_trailing {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        String trimmedStr = trim(str);

        System.out.println("Trimmed string using built-in method: " + str.trim());

        System.out.println("Trimmed string using user-defined method: " + trimmedStr);

        System.out.println("Are the strings equal? " + compareStrings(trimmedStr, str.trim()));
    }

    public static String trim(String str) {
        int[] points = findTrimPoints(str);

        return str.substring(points[0], points[1] + 1);
    }

    public static int[] findTrimPoints(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (str.charAt(start) == ' ') {
            start++;
        }

        while (str.charAt(end) == ' ') {
            end--;
        }

        return new int[] { start, end };
    }

    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}
