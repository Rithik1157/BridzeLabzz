import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number <= 0) {
            System.out.println("Error: Not a natural number.");
            return;
        }

        String[] fizzBuzz = new String[number + 1];

        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                fizzBuzz[i] = "FizzBuzz";
            } else if (i % 3 == 0) {      
                fizzBuzz[i] = "Fizz";
            } else if (i % 5 == 0) {      
                fizzBuzz[i] = "Buzz";          
            } else {
                fizzBuzz[i] = String.valueOf(i); 
            }
        }
        
        for (int i = 0; i <= number; i++) {
            System.out.println("Position " + i + " = " + fizzBuzz[i]);
        }
        sc.close();
    }
}



