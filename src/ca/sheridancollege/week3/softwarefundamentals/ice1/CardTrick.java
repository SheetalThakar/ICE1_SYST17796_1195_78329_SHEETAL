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
 * @Pallavi Sharma-991548375
 */
import java.util.Scanner;
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setValue((int)(Math.random()*13)+1);
            c.setSuit(Card.SUITS[(int)(Math.random()*4)]);
            magicHand[i]=c;
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        
        
        
        
       
        
        System.out.println("The generated cards were ");
        for(int i = 0 ;i<magicHand.length;i++)
        {
            System.out.println("Card "+(i+1)+" is "+magicHand[i].getValue()+" of "+magicHand[i].getSuit());
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a card number:");
        int card=sc.nextInt();
        System.out.println("Enter a suit number");
        String suit=sc.next();
        Card c=new Card();
        c.setValue(card);
        c.setSuit(suit);
        System.out.println("The new card is: "+c.getValue()+" of "+c.getSuit());
         Card luckyCard=new Card();
        luckyCard.setValue(6);
        luckyCard.setSuit("Hearts");
        
        
        
        
    }
    
}
