/*
 * Student number:991550003
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Karanbir Singh
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int)(Math.random()*13 +1));
            c.setSuit(Card.SUITS[(int)(Math.random()*4)]);
            magicHand[i] = new Card();
            magicHand[i].setSuit(c.getSuit());
            magicHand[i].setValue(c.getValue());
        }
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter a card value from 1-13");
        int value = Integer.parseInt(input.nextLine());
        System.out.println("Please enter card suits i.e Hearts , diamonds , spades ,clubs");
        String suits = input.nextLine();
        
        System.out.println("The card is " + value + " of " + suits);
        // and search magicHand here
        //Then report the result here
    }
    
}
