import java.util.Scanner;

public class StudentGrades2d {
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
            } else {
                grade[i] = "F";
            }
        }

        for (int i = 0; i < number; i++) {
            System.out.println("Student " + (i + 1) + " marks: ");
            System.out.println("Physics: " + studentData[i][0]);
            System.out.println("Chemistry: " + studentData[i][1]);
    }
}
