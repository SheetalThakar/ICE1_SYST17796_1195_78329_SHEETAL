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
 * @Modifier Gurmannat_Oberoi
 */

import java.util.*;
public class CardTrick {
    
    public static void main(String[] args)
    {        
        
        Random rand = new Random();
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(rand.nextInt(12)+1);
            c.setSuit(Card.SUITS[rand.nextInt(3)]);
            
            magicHand[i]=c;
            System.out.println("The card of magic hand is "+ c.getValue()+" of "+c.getSuit());
            
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        Card luckyCard= new Card();
        luckyCard.setValue(2);
        luckyCard.setSuit(Card.SUITS[2]);
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please pick a card ");
        
        System.out.println("First pick a value from 1-13");
        
        int val = input.nextInt();
        
        System.out.println("Now pick the suit-Hearts, Diamonds, Spades and Clubs for 0, 1, 2, 3 each ");
        
        int s=input.nextInt();
        String str=Card.SUITS[s];
        
        System.out.println("The user chose the card "+val+" of "+str);
              
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }
    
}
