
import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] ages = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter the age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt(); 
        }

        String[][] ageVote = findAgeVote(ages);

        displayTable(ageVote);
    }

    public static String[][] findAgeVote(int[] ages) {
        String[][] ageVote = new String[10][2];

        for (int i = 0; i < 10; i++) {
            if (ages[i] < 0) {
                ageVote[i][0] = Integer.toString(ages[i]); 
                ageVote[i][1] = "Invalid Age"; 
            }
            else if (ages[i] >= 18) {
                ageVote[i][0] = Integer.toString(ages[i]); 
                ageVote[i][1] = "Can Vote"; 
            }
            else {
                ageVote[i][0] = Integer.toString(ages[i]); 
                ageVote[i][1] = "Cannot Vote"; 
            }
        }
        return ageVote;
    }

    public static void displayTable(String[][] ageVote) {
        System.out.println("Age\tCan Vote");

        for (int i = 0; i < 10; i++) {
            System.out.println(ageVote[i][0] + "\t" + ageVote[i][1]);
        }
    }
}
