/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Scanner;
import java.util.Random;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author sheetal
 * @modifier Saumya Mehta
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
         Scanner box = new Scanner(System.in);
            
            System.out.println("Please Pick A Card.");
            int card1 = box.nextInt();
            box.nextLine();
            
            System.out.println("Please Pick The Suit For The Selected Card.");
            String color1 = box.nextLine();
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            
            Random number = new Random();
            
            int value = number.nextInt((13-1)+1)+1;
         
            int suit = number.nextInt((3-1)+1)+0;
            
            c.setValue(value);
            c.setSuit(Card.SUITS[suit]);
            
            System.out.println("Value: "+c.getValue());
            System.out.println("Suit: "+c.getSuit());
            
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            
            magicHand[i]=c;
        }
        
        
        for(int i=0;i<magicHand.length;i++)
        {
        if(magicHand[i].getValue()==card1 && magicHand[i].getSuit().equals(color1))
             
             System.out.println("The card is present in the magic hand");
             
        else
              System.out.println("The card is not present in the magic hand");
             
        break;
        }
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }
    
}
