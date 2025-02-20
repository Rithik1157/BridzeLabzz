

import java.util.Scanner;

public class Percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the number of students: "); 
        int n = sc.nextInt(); 

        int[][] scores = generateScores(n);

        double[][] results = calculateResults(scores);

        String[][] grades = calculateGrades(results);

        displayScorecard(scores, results, grades);
    }

    public static int[][] generateScores(int n) {
        int[][] scores = new int[n][3]; 

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = (int) (Math.random() * 101); 
            }
        }
        return scores; 
    }

    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][4]; 

        for (int i = 0; i < scores.length; i++) {
            results[i][0] = scores[i][0] + scores[i][1] + scores[i][2]; 
            results[i][1] = Math.round(results[i][0] / 3.0 * 100) / 100.0; 
        }
        return results; 
    }

    public static String[][] calculateGrades(double[][] results) {
        String[][] grades = new String[results.length][2]; 

        for (int i = 0; i < results.length; i++) {
            if (results[i][1] >= 90) {
                grades[i][0] = "A"; 
            } else if (results[i][1] >= 80) {
                grades[i][0] = "B"; 
            } else if (results[i][1] >= 70) {
                grades[i][0] = "C"; 
            } else if (results[i][1] >= 60) {
                grades[i][0] = "D"; 
            } else {
                grades[i][0] = "F"; 
            }
            grades[i][1] = results[i][1] + "%"; 
        }
        return grades; 
    }

    public static void displayScorecard(int[][] scores, double[][] results, String[][] grades) {
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade"); // Print header

        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + "\t" + scores[i][0] + "\t" + scores[i][1] + "\t" + scores[i][2] + "\t"
                    + results[i][0] + "\t" + results[i][1] + "\t" + grades[i][1] + "\t" + grades[i][0]);
        }
    }
}