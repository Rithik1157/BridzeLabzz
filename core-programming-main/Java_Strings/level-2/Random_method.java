import java.util.Scanner;

public class Random_method {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of games: ");
        int games = sc.nextInt(); 
        String[][] stats = playGame(games); 
        displayStats(stats); 
    }

    public static String[][] playGame(int games) {
        String[] choices = { "Rock", "Paper", "Scissors" }; 
        String[][] stats = new String[games][3]; 
        int playerWins = 0;
        int computerWins = 0;

        for (int i = 0; i < games; i++) {
            int playerChoice = getPlayerChoice(); 
            int computerChoice = getComputerChoice(); 
            String winner = findWinner(choices[playerChoice], choices[computerChoice]); 

            if (winner.equals("Player")) {
                playerWins++; 
            } else if (winner.equals("Computer")) {
                computerWins++; 
            }

            stats[i][0] = choices[playerChoice];
            stats[i][1] = choices[computerChoice];
            stats[i][2] = winner;
        }

        stats[games - 1][0] = "Player Wins: " + playerWins;
        stats[games - 1][1] = "Computer Wins: " + computerWins;
        stats[games - 1][2] = "Player Win Percentage: " + (playerWins * 100 / games) + "%";

        return stats;
    }

    public static int getPlayerChoice() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice (0 for Rock, 1 for Paper, 2 for Scissors): ");
        return sc.nextInt(); 
    }

    public static int getComputerChoice() {
        return (int) (Math.random() * 3); 
    }

    public static String findWinner(String playerChoice, String computerChoice) {
        if (playerChoice.equals("Rock") && computerChoice.equals("Scissors")) {
            return "Player";
        } else if (playerChoice.equals("Scissors") && computerChoice.equals("Paper")) {
            return "Player";
        } else if (playerChoice.equals("Paper") && computerChoice.equals("Rock")) {
            return "Player";
        } else if (playerChoice.equals(computerChoice)) {
            return "Draw";
        } else {
            return "Computer";
        }
    }

    public static void displayStats(String[][] stats) {
        System.out.println("Player\tComputer\tWinner");
        for (int i = 0; i < stats.length - 1; i++) {
            System.out.println(stats[i][0] + "\t" + stats[i][1] + "\t" + stats[i][2]);
        }
        System.out.println(stats[stats.length - 1][0]);
        System.out.println(stats[stats.length - 1][1]);
        System.out.println(stats[stats.length - 1][2]);
    }
}