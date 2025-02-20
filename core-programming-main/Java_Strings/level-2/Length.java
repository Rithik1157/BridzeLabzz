

import java.util.Scanner;

public class Length {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter a string: "); 
        String str = sc.next(); 

        System.out.println("Length of the string using built-in method: " + str.length());

        System.out.println("Length of the string using user-defined method: " + findLength(str));
    }

    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count); 
                count++; 
            }
        } catch (Exception e) { 
            return count; 
        }
    }
}
