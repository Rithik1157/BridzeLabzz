import java.util.Scanner;

public class Unique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.println("Enter the text");
        String text = sc.nextLine();

        int length = findLength(text); 
        char[] unique = findUnique(text); 

        System.out.println("Length of the text is " + length);
        System.out.println("Unique characters in the text are:");

        for (char c : unique) {
            System.out.print(c + " ");
        }
    }

    public static int findLength(String text) {
        int length = 0;

        for (int i = 0; i < text.length(); i++) {
            length++;
        }

        return length;
    }

    public static char[] findUnique(String text) {
        char[] result = new char[text.length()];
        int k = 0;

        for (int i = 0; i < text.length(); i++) {
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (text.charAt(i) == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                result[k++] = text.charAt(i);
            }
        }

        char[] unique = new char[k];
        for (int i = 0; i < k; i++) {
            unique[i] = result[i];
        }

        return unique;
    }
}
