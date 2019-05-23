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
 * @modifier lovejesh
 */
import java.util.*;
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card luckyCard=new Card(1,"Diamonds");
        Card[] magicHand = new Card[7];
        String card;
        Scanner input=new Scanner(System.in);
        CardTrick self= new CardTrick();
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(self.numberGenerator1());
            c.setSuit(Card.SUITS[self.numberGenerator2()]);
            
            magicHand[i]=c;
        }
        for(int i=0;i<magicHand.length;i++)
        {
            System.out.println(magicHand[i].getValue()+" OF "+ magicHand[i].getSuit());
        }
        System.out.println("Enter a value of card(1-13?");
        int a=input.nextInt();
         
        System.out.println("Enter the name of card 0,1,2,3 for hearts, diamonds, spades and club ");
        int b=input.nextInt();
         System.out.println("The user chose "+Card.SUITS[b]+" of " + a);
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        System.out.println(luckyCard.getSuit()+" of " + luckyCard.getValue());
    }
    public int numberGenerator1()
    {
        Random rand =new Random();
        return (rand.nextInt(12)+1);
    }
    public int numberGenerator2()
    {
        Random rand =new Random();
        return (rand.nextInt(4));
    }
    
    
}
