/*
 * MERT HAVZA
 * 991538291
 */
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
        
        Card luckyCard = new Card();
        
        luckyCard.setValue(10);
        luckyCard.setSuit("spades");
        
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(rand.nextInt(13)+1);
            c.setSuit(Card.SUITS[rand.nextInt(3)+1]);
            
            System.out.println(c.getValue()+" of "+c.getSuit());
            
        }
        
        System.out.println("Pick a card suit");
        String suit = input.nextLine();
        
        System.out.println("Pick a card value");
        int value = input.nextInt();
        
        System.out.println("Your card is: "+value+" of "+suit);
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }
    
}
