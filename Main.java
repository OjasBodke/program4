import java.util.*;

public class Main {
    public static void main(String args[]) {
        Deck deck = new Deck();
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Create Deck");
            System.out.println("2. Print Deck");
            System.out.println("3. Print Card");
            System.out.println("4. Same Card");
            System.out.println("5. Compare Card");
            System.out.println("6. Find Card");
            System.out.println("7. Deal Card");
            System.out.println("8. Shuffle Deck");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            switch (choice) {
                case 1:
                    deck.createDeck();
                    break;
                case 2:
                    deck.printDeck();
                    break;
                case 3:
                    deck.showCard();
                    break;
                case 4:
                    deck.sameCard();
                    break;
                case 5:
                    deck.compareCard();
                    break;
                case 6:
                    deck.findCard();
                    break;
                case 7:
                    deck.dealCard();
                    break;
                case 8:
                    deck.shuffleDeck();
                    break;
                case 9:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 9.");
            }
        } while (choice != 9);
    }
}