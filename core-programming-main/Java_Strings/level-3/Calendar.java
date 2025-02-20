import java.util.Scanner;

public class Calendar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the month: ");
        int month = sc.nextInt();
        System.out.println("Enter the year: ");
        int year = sc.nextInt();

        displayCalander(month, year);
    }

    public static void displayCalander(int month, int year) {
        String[] months = { "January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December" };


        int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        int day = getFirstDay(month, year);

        System.out.println("Calendar for " + months[month - 1] + " " + year);
        System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");

        for (int i = 0; i < day; i++) {
            System.out.print("\t");
        }

        for (int i = 1; i <= days[month - 1]; i++) {
            System.out.print(i + "\t");

            if ((i + day) % 7 == 0) {
                System.out.println();
            }
        }
    }

    public static int getFirstDay(int month, int year) {
        int y0 = year - (14 - month) / 12; 
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400; 
        int m0 = month + 12 * ((14 - month) / 12) - 2; 
        int d0 = (1 + x + 31 * m0 / 12) % 7; 
        return d0; 
    }
}
