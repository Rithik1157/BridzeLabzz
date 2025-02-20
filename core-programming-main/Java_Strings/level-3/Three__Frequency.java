import java.util.Scanner;

public class Three__Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the text");
        String text = sc.nextLine();

        String[][] result = findFrequency(text);

        System.out.println("Character\tFrequency");
        for (int i = 0; i < result.length; i++) {
            if (!result[i][1].equals("0")) {
                System.out.println(result[i][0] + "\t\t" + result[i][1]);
            }
        }
    }

    public static String[][] findFrequency(String text) {
        int[] frequency = new int[256]; 

        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        String[][] result = new String[256][2];

        for (int i = 0; i < 256; i++) {
            result[i][0] = Character.toString((char) i); 
            result[i][1] = Integer.toString(frequency[i]); 
        }
        return result;
    }
}