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
 * Modifier Gurminderdeep
 * Student Number: 991542689
 */

public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            int min = 1;
            int  max = 13;
            c.setValue((int) ((Math.random()*(max-min+1))+min));
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            min = 0;
            max = 3;
            c.setSuit(Card.SUITS[((int) ((Math.random()*(3-0+1))+0))]);
            System.out.println(c.getValue()+" of "+c.getSuit());
        }
        
       
        //insert code to ask the user for Card value and suit, create their card
        Scanner scan = new Scanner(System.in);
        System.out.println("Pick a card value > ");
        int cardValuePicked = scan.nextInt();
        System.out.println("Pick a card suit(0 to 3) >");
        int cardSuitPicked = scan.nextInt();
        Card userCard = new Card();
        userCard.setValue(cardValuePicked);
        userCard.setSuit(Card.SUITS[cardSuitPicked]);
        System.out.println("The card You picked was "+ userCard.getValue()+" of "+userCard.getSuit());
        
    }
    
}
