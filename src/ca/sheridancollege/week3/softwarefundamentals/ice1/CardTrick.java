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
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
       Random rdm = new Random();
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
   
             int suits= (int)(Math.random()*3+1);
            c.setValue(rdm.nextInt(13)+1);
            c.setSuit(Card.SUITS[rdm.nextInt(3)]);
            magicHand[i]=c;
            //c.setValuec.(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        Scanner input= new Scanner(System.in);
        System.out.println("Enter card value and suit");
        int value= input.nextInt();
        String suit= input.next();
        for(int i=0; i<magicHand.length;i++){
        
           System.out.println("Suit Value:"+magicHand[i].getSuit());
        
        System.out.println("card value:"+ magicHand[i].getValue() );
        }
        System.out.println("Your value:"+value+"your card:"+suit);
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        hello
    }
    
}
