import java.util.Scanner;

public class StudentGrades {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of students: ");
        int number = sc.nextInt();
        double[][] studentData = new double[number][3];
        double[] percentage = new double[number];
        String[] grade = new String[number];

        for (int i = 0; i < number; i++) {
            System.out.println("Enter the marks of student " + (i + 1) + " in physics: ");
            studentData[i][0] = sc.nextDouble();
            if (studentData[i][0] < 0) {
                System.out.println("Please enter a positive value for marks.");
                i--;
                continue;
            }

            System.out.println("Enter the marks of student " + (i + 1) + " in chemistry: ");
            studentData[i][1] = sc.nextDouble();
            if (studentData[i][1] < 0) {
                System.out.println("Please enter a positive value for marks.");
                i--;
                continue;
            }

            System.out.println("Enter the marks of student " + (i + 1) + " in maths: ");
            studentData[i][2] = sc.nextDouble();
            if (studentData[i][2] < 0) {
                System.out.println("Please enter a positive value for marks.");
                i--;
                continue;
            }

            percentage[i] = (studentData[i][0] + studentData[i][1] + studentData[i][2]) / 3;

            if (percentage[i] >= 90) {
                grade[i] = "A";
            } else if (percentage[i] >= 80) {
                grade[i] = "B";
            } else if (percentage[i] >= 70) {
                grade[i] = "C";
            } else if (percentage[i] >= 60) {
                grade[i] = "D";
            } else if (percentage[i] >= 40) {
                grade[i] = "E";
            } else {
                grade[i] = "F";
            }

        }

        System.out.println("Student\tPhysics\tChemistry\tMaths\tPercentage\tGrade");
        
        for (int i = 0; i < number; i++) {
            System.out.println((i + 1) + "\t" + studentData[i][0] + "\t" + studentData[i][1] + "\t" + studentData[i][2] + "\t" + percentage[i] + "\t" + grade[i]);
        }
    }
}