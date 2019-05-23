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
 * @modifier: Jashandeep Kaur
 * Student number=991549357
 */
 import java.util.*;
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
       
        
        Random rand=new Random();
        Scanner input=new Scanner(System.in);
        
       
        for (int i=0; i<magicHand.length; i++)
        { 
             int cardNumber=rand.nextInt(14)+1;
             int suitNumber=rand.nextInt(4);
        
            Card c = new Card();
            c.setValue(cardNumber);
            c.setSuit(Card.SUITS[suitNumber]);
            System.out.println("your card suit"+c.getSuit());
                System.out.println("your card number"+c.getValue());
        }
        
        System.out.println("please enter your card value");
        String userGuess=input.nextLine();
        System.out.println("enter your suit");
        int num=input.nextInt();
        System.out.println("user card number is:"+num);
            System.out.println("user suit number"+userGuess);
    }
    
}
