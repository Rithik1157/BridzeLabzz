
import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] arr = new double[10][2];

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter the weight of person " + (i + 1) + " in kg");
            arr[i][0] = sc.nextDouble();
            System.out.println("Enter the height of person " + (i + 1) + " in cm");
            arr[i][1] = sc.nextDouble();
        }

        String[][] result = findBMI(arr);
        display(result);
    }

    public static String[][] findBMI(double[][] arr) {
        String[][] result = new String[10][4];

        for (int i = 0; i < 10; i++) {
            double weight = arr[i][0];
            double height = arr[i][1] / 100;
            double bmi = weight / (height * height);
            String status = "";

            if (bmi < 18.5) {
                status = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                status = "Normal weight";
            } else if (bmi >= 25 && bmi < 29.9) {
                status = "Overweight";
            } else {
                status = "Obesity";
            }

            result[i][0] = String.valueOf(arr[i][0]);
            result[i][1] = String.valueOf(arr[i][1]);
            result[i][2] = String.valueOf(bmi);
            result[i][3] = status;
        }
        return result;
    }

    public static void display(String[][] result) {
        System.out.println("Person's Height\tPerson's Weight\tBMI\tStatus");

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(result[i][j] + "\t\t\t");
            }
            System.out.println();
        }
    }
}
