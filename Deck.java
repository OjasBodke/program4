import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.util.Collections;

class Deck {
    ArrayList<Cards> cards = new ArrayList<Cards>();

    public void createDeck() {
        String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] suits = {"Clubs", "Hearts", "Spades", "Diamonds"};

        for (String suit : suits) {
            for (String rank : ranks) {
                cards.add(new Cards(rank, suit));
            }
        }
        System.out.println("Deck created successfully.");
    }

    public void printDeck() {
        System.out.println("Printing Deck:");
        for (Cards card : cards) {
            System.out.println(card);
        }
    }

    public void showCard() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter index of card to display: ");
        int index = scanner.nextInt();
        if (index >= 0 && index < cards.size()) {
            System.out.println(cards.get(index));
        } else {
            System.out.println("Invalid index.");
        }
    }

     public void sameCard() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the suit to find cards with the same suit: ");
        String inputSuit = scanner.nextLine();
        
        boolean found = false;
        System.out.println("Cards with the same suit (" + inputSuit + "):");
        for (Cards card : cards) {
            if (card.getSuit().equalsIgnoreCase(inputSuit)) {
                System.out.println(card);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No cards with the suit " + inputSuit + " found.");
        }
    }

    public void compareCard() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the rank to compare cards: ");
        String inputRank = scanner.nextLine();
        
        boolean found = false;
        System.out.println("Cards with rank " + inputRank + ":");
        for (Cards card : cards) {
            if (card.getRank().equalsIgnoreCase(inputRank)) {
                System.out.println(card);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No cards with rank " + inputRank + " found.");
        }
    }

    public void findCard() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the suit of the card to find: ");
        String inputSuit = scanner.nextLine();
        System.out.print("Enter the rank of the card to find: ");
        String inputRank = scanner.nextLine();
        
        boolean found = false;
        for (Cards card : cards) {
            if (card.getSuit().equalsIgnoreCase(inputSuit) && card.getRank().equalsIgnoreCase(inputRank)) {
                System.out.println("Card found: " + card);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Card not found.");
        }
    }

    public void dealCard() {
        System.out.println("Dealing 5 random cards:");
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int index = random.nextInt(cards.size());
            System.out.println(cards.get(index));
        }
    }

    public void shuffleDeck() {
        Collections.shuffle(cards);
        System.out.println("Deck shuffled successfully.");
    }
}