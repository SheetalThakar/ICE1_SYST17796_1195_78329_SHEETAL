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
 * student number- 991547699
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int)(Math.random()*12)+1);
            c.setSuit(Card.SUITS[(int)(Math.round(Math.random()*3))]);
            System.out.println("cards are "+c.getValue()+" of "+c.getSuit());
        }
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the suit of favourite card");
        String suit= input.nextLine();
        System.out.println("Enter the number of favourite card ");
        int number= input.nextInt();
        System.out.println("Your card is "+number+" of "+suit);
        // and search magicHand here
        //Then report the result here
        Card luckyCard =new Card();
        luckyCard.setValue(1);
        luckyCard.setSuit("Spades");
        System.out.println(luckyCard.getValue()+" of "+luckyCard.getSuit());
    }
    
}
