/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author sheetal
  *@modifier Aman Deep Kaur
  * Student Number: 991548868*/
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
          Random r = new Random(); 
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(r.nextInt(13)+1);
            
            c.setSuit(Card.SUITS[r.nextInt(4)]);
            magicHand[i] = c;
        }
        Scanner input = new Scanner(System.in);
         System.out.println("Enter the card value ");
         int value = input.nextInt();
         
         System.out.println("Enter a suit:Hearts, Diamond, Spades, Clubs");
         String suit = input.next();
         
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
         
        for(int i=0; i<magicHand.length ; i++){
            System.out.println("The card values are" + magicHand[i].getValue());
            System.out.println("The suit values are"+ magicHand[i].getSuit());
         sout`x
        }
    }
    
}
