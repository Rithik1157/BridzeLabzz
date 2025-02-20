import java.util.Scanner;

public class Shortest_longest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: "); 
        String str = sc.nextLine(); 
        String[] words = splitWords(str); 
        String[][] wordsLength = splitWordsLength(words);
        int[] shortLong = findShortLong(wordsLength); 

        System.out.println("Shortest word: " + words[shortLong[0]]);
        System.out.println("Longest word: " + words[shortLong[1]]);
    }

    public static String[] splitWords(String str) {
        return str.split(" "); 
    }

    public static String[][] splitWordsLength(String[] words) {
        String[][] wordsLength = new String[words.length][2]; 
        for (int i = 0; i < words.length; i++) {
            wordsLength[i][0] = words[i]; 
            wordsLength[i][1] = String.valueOf(words[i].length()); 
        }
        return wordsLength;
    }

    public static int[] findShortLong(String[][] wordsLength) {
        int[] shortLong = new int[2]; 
        shortLong[0] = 0; 
        shortLong[1] = 0; 

        for (int i = 1; i < wordsLength.length; i++) {
            int currentLength = Integer.parseInt(wordsLength[i][1]); 
            int shortLength = Integer.parseInt(wordsLength[shortLong[0]][1]); 
            int longLength = Integer.parseInt(wordsLength[shortLong[1]][1]); 

            if (currentLength < shortLength) {
                shortLong[0] = i; 
            }
            if (currentLength > longLength) {
                shortLong[1] = i; 
            }
        }
        return shortLong;
    }
}
