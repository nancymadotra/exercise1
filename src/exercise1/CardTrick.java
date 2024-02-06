package exercise1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author Nancy
 * @author Nancy  Nancy  Feb 5, 2024 
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

         for (int i = 0; i < hand.length; i++) {
            int value = random.nextInt(13) + 1; // Values 1-13 (1=Ace, 11=Jack, 12=Queen, 13=King)
            String suit = Card.SUITS[random.nextInt(4)]; // Assuming Card.SUITS is a String[] {"Hearts", "Diamonds", "Clubs", "Spades"}
            hand[i] = new Card();
            hand[i].setValue(value);
            hand[i].setSuit(suit);
        
      //card.setValue(insert call to random number generator here)
            // 
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
         }

        // insert code to ask the user for Card value and suit, create their card
        System.out.println("Pick a card value (1=Ace, 11=Jack, 12=Queen, 13=King):");
        int userValue = scanner.nextInt();
        System.out.println("Pick a suit (0=Hearts, 1=Diamonds, 2=Clubs, 3=Spades):");
        int suitIndex = scanner.nextInt();
        String userSuit = Card.SUITS[suitIndex];

        // and search the hand here.
         boolean found = false;
        for (Card card : hand) {
            if (card.getValue() == userValue && card.getSuit().equalsIgnoreCase(userSuit)) {
                found = true;
                break;
            }
      
        if (found) {
            printInfo();
        } else {
            System.out.println("Sorry, your card was not in the hand.");
        }
        // If the guess is successful, invoke the printInfo() method below.
          // Close the scanner
        scanner.close();
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Feb5 Jan 2024
     */
    }
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Nancy, but you can call me dear, Nancy ");
        System.out.println();
        
        System.out.println("My career ambitions:Software DeveloperGood Programmer");
        System.out.println("-- Be more active on LinkedIn");
        System.out.println("-- Have a semester with no violations of academic integrity!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Investing");
        System.out.println("-- Playing");
        System.out.println("-- Watching TV");
        System.out.println("-- DAncing");

        System.out.println();
        
    
    }

}
