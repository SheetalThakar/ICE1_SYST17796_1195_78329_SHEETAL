/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author sheetal
 * @modifier Manpreet kaur (991544958)
 */

import java.util.Scanner;

public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        int ranCard = (int) (Math.random()*13 +1);
        int ranSuit = (int) (Math.random()*3);
       
        System.out.println(" The random card is :" + ranCard);
        System.out.println(" The random suit is: " + ranSuit);
        
        
        Scanner in = new Scanner(System.in);
        System.out.println(" Enter any number between 1 to 7 card: ");
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter any number between 0 to 4 for suit: ");
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }
    
}
