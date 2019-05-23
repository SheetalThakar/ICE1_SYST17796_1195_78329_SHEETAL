package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.*;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author sheetal
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];

        Random rand = new Random();
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();

            //c.setValue(insert call to random number generator here)
            c.setValue(rand.nextInt(13) + 1);

            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[rand.nextInt(4)]);
            magicHand[i] = c;

        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the value: ");
        int value = scanner.nextInt();
        
        System.out.print("Please ether the suit: Hearts, Diamonds, Spades, Clubs: ");
        String suit = scanner.next();

        // A boolean varible for te
        boolean flag = false;
        
        System.out.println("The 7 magic hand cards are: ");
        
        Card luckyCard = new Card();
        luckyCard.setValue(12);
        luckyCard.setSuit("Clubs");
        
        // loop all the card object magicHand[i].getValue()
        for (Card card: magicHand) {
            
            // record the value and suit of each card
            int cardValue = luckyCard.getValue();
            String cardSuit = luckyCard.getSuit();
            System.out.print(cardSuit + " " + cardValue + ", ");
            
            // if user's input is equal to the value and suit of magic card?
            if (value == cardValue && suit.equals(cardSuit)) 
                flag = true;
            }
            
            //Then report the result here
            System.out.println();
            if (flag){
                System.out.println("The card you choose is: " + suit + " " + value + ". It is in the magic hand cards!");
            }else {
                System.out.println("The card you choose is: " + suit + " " + value + ". It is not in the magic hand cards!");
        }

    }
    
}

