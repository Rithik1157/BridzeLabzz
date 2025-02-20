import java.util.Scanner;

public class Display_Characters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter a string: "); 
        String str = sc.nextLine(); 

        String[][] vowelsConsonants = findVowelsConsonants(str);

        displayVowelsConsonants(vowelsConsonants);
    }

 
    public static String[][] findVowelsConsonants(String str) {
        String[][] vowelsConsonants = new String[str.length()][2]; 

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); 
            vowelsConsonants[i][0] = String.valueOf(ch);
            vowelsConsonants[i][1] = isVowel(ch); 
        }
        return vowelsConsonants;
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

    public static void displayVowelsConsonants(String[][] vowelsConsonants) {
        System.out.println("Character\tType"); // Print table header

        for (String[] character : vowelsConsonants) {
            System.out.println(character[0] + "\t\t" + character[1]);
        }
    }
}
