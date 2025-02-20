import java.util.Scanner;
public class Consonents_Vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        int[] vowelsConsonants = findVowelsConsonants(str);

        System.out.println("Vowels: " + vowelsConsonants[0]);
        System.out.println("Consonants: " + vowelsConsonants[1]);
    }

    public static int[] findVowelsConsonants(String str) {
        int vowels = 0; 
        int consonants = 0; 

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); 
            if (isVowel(ch) == "Vowel") {
                vowels++; 
            } else if (isVowel(ch) == "Consonant") {
                consonants++; 
            }
        }

        return new int[] { vowels, consonants };
    }

    public static String isVowel(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32); 
        }

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return "Vowel"; 
        }
        else if ((ch >= 'a' && ch <= 'z')) {
            return "Consonant"; 
        }
        else {
            return "Not a Letter";
        }
    }
}
