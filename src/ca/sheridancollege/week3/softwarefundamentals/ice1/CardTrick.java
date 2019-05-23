/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.*;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author sheetal
 * @modifier Komal Kapoor -991539309
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            Random rand = new Random();
        int ran=rand.nextInt((12)+1);
        int suit1 = rand.nextInt(3);
            
            c.setValue(ran);//c.setValue(insert call to random number generator here)
            c.setSuit(Card.SUITS[suit1]);//insert call to random number between 0-3 here])
        }
        
       Scanner input = new Scanner(System.in);
       System.out.println("Insert card value");//insert code to ask the user for Card value and suit, create their card
        int sc = input.nextInt();
        System.out.println("Insert suit");
        int scc = input.nextInt();
        String str = Card.SUITS[scc];
       
                System.out.println("The value of the card is " +sc+ " and suit of the card is "+str  );
        Card luckyCard = new Card();
        luckyCard.setValue(4);
        luckyCard.setSuits(Card.SUITS[2]);
// and search magicHand here
        //Then report the result here
    }
    
}
