/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author sheetal
 * @Modifier Manpreet Manni 991540126
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int)(Math.random() * 13 + 1));
            c.setSuit(Card.SUITS[(int)(Math.random() * 4)]);
            
            magicHand[i] = c;
        }
        
        //insert code to ask the user for Card value and suit, create their card
        Scanner input = new Scanner(System.in);
        
        // taking inputs
        System.out.print("Enter a Suit: ");
        String userEnteredSuit = input.next();
        
        System.out.print("Enter a number (1 - 13): ");
        int userEnteredValue = input.nextInt();
        
        // object creation
        Card newCardObject = new Card();
        newCardObject.setSuit(userEnteredSuit);
        newCardObject.setValue(userEnteredValue);
        
        // displaying result
        System.out.println("You picked: " + newCardObject.getValue() + " of "
                            + newCardObject.getSuit());
        
        // and search magicHand here
        //Then report the result here
    }
    
}
