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
 * //modifier Yewon Lee
 */

 import java.util.*;
public class CardTrick {
    

    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(Math. random() * 13 );
            c.setSuit(Card.SUITS(Math. random() * 3) ;
        }
        
        
        Scanner input  = new Scanner (System.in);
        
        
        System.out.println ("Guess your card starting with value");
        int valueGuess = input.nextInt();
        System.out.println ("Guess your card with suit 1-Hearts, 2-Diamonds, 3-Spades,4-Clubs");
        int suitGuess = input.nextInt();
        
        
        System.out.println ("your guess for the value was "+ valueGuess + " and for suit was " + suitGuess);
        System.out.println ("Magic hand was " + c.getValue + " and " + c.getSuit);
        
        
    }
    
}
