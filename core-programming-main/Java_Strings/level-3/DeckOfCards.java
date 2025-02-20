import java.util.Random;
import java.util.Scanner;

public class DeckOfCards {
    static String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    static String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    static int numOfCards = suits.length * ranks.length;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of players:");
        int players = sc.nextInt();
        System.out.println("Enter number of cards to distribute:");
        int cardsToDistribute = sc.nextInt();

        String[] deck = initializeDeck();
        shuffleDeck(deck);
        String[][] distributedCards = distributeCards(deck, players, cardsToDistribute);
        printDistributedCards(distributedCards);
    }

    public static String[] initializeDeck() {
        String[] deck = new String[numOfCards];
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    public static void shuffleDeck(String[] deck) {
        Random rand = new Random();
        for (int i = 0; i < deck.length; i++) {
            int randomIndex = i + rand.nextInt(deck.length - i);
            String temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;
        }
    }

    public static String[][] distributeCards(String[] deck, int players, int cardsToDistribute) {
        if (players * cardsToDistribute > deck.length) {
            throw new IllegalArgumentException("Not enough cards to distribute.");
        }
        String[][] distributedCards = new String[players][cardsToDistribute];
        int index = 0;
        for (int i = 0; i < players; i++) {
            for (int j = 0; j < cardsToDistribute; j++) {
                distributedCards[i][j] = deck[index++];
            }
        }
        return distributedCards;
    }

    public static void printDistributedCards(String[][] distributedCards) {
        for (int i = 0; i < distributedCards.length; i++) {
            System.out.println("Player " + (i + 1) + " cards:");
            for (String card : distributedCards[i]) {
                System.out.println(card);
            }
            System.out.println();
        }
    }
}
