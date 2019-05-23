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
 * @modifier Robin Singh 991540462
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
            System.out.println("Card "+(i+1)+" is "+c.getValue()+" of "+c.getSuit());
                  
        }
        System.out.println();
        Scanner input= new Scanner(System.in);
        System.out.println("enter the suit and number");
        int u_number= input.nextInt();
        String u_suit= input.nextLine();
        System.out.println(" your card entered is :"+u_number+" of "+u_suit);
        // and search magicHand here
        //Then report the result here
        Card luckyCard = new Card();
        luckyCard.setValue(5);
        luckyCard.setSuit("Spades");
        System.out.println("Lucky Card is :"+luckyCard.getValue()+" of "+luckyCard.getSuit());
    }
    
}
