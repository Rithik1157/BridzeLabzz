
import java.util.Scanner;

public class Two_Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text");
        String text = sc.nextLine();

        int[][] result = findFrequency(text);

        System.out.println("Character\tFrequency");
        for (int i = 0; i < result.length; i++) {
            if (result[i][1] != 0) {
                System.out.println((char) result[i][0] + "\t\t" + result[i][1]);
            }
        }
    }

    public static int[][] findFrequency(String text) {
        int[] frequency = new int[256];

        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        int[][] result = new int[256][2];

        for (int i = 0; i < 256; i++) {
            result[i][0] = i;
            result[i][1] = frequency[i];
        }
        return result;
    }
}
