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
 * @modifier NidhiPatel
 * Student no. 991548229
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Scanner scan= new Scanner(System.in);
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
             int min=1;
             int max=13;
            c.setValue((int)((Math.random()*(max-min+1))+min));
            c.setSuit(Card.SUITS[(int)((Math.random()*(3-0+1))+0)]);
            System.out.println(c.getValue()+" of "+c.getSuit());
              
                        
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        
        System.out.println("Enter Card value in 1-13: ");
        int cardVal = scan.nextInt();
        System.out.println("Enter suit value in 1-4: ");
        int cardSuit= scan.nextInt();      
        System.out.println("Your choosen card is: "+cardVal+" of "+Card.SUITS[cardSuit]);
        
        //insert code to ask the user for Card value and suit, create their card3
        Card luckyCard= new Card();
        luckyCard.setValue(3);
        luckyCard.setSuit(Card.SUITS[3]);
        System.out.println("Your LuckyCard is: "+luckyCard.getValue()+" of "+luckyCard.getSuit());
        
        //Then report the result here
    }
    
}
