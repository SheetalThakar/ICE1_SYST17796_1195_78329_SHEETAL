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
 * @Sargun Josun
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int)(Math.random()*13)+1);
            c.setSuit(Card.SUITS[(int)(Math.random()*4)]);
            magicHand[i]= c;
        }
        
        
        //insert code to ask the user for Card value and suit, create their card
        System.out.println("The generated cards are:");
        for(int i=0;i<magicHand.length;i++)
        {
            System.out.println("Card "+(i+1)+" is "+magicHand[i].getValue()+" of "+magicHand[i].getSuit());
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter card value(1-13)");
        int cardValue = sc.nextInt();
        System.out.println("Enter suit value(Hearts,Clubs,Diamonds,Spades");
        String suit = sc.next();
        
        Card newObject = new Card();
        newObject.setValue(cardValue);
        newObject.setSuit(suit);
        
        //printing the new object
        System.out.println("The new card is "+newObject.getValue()+" of "+newObject.getSuit());
        
        Card luckyCard = new Card();
        luckyCard.setValue(5);
        luckyCard.setSuit("Hearts");
    }
    
}
