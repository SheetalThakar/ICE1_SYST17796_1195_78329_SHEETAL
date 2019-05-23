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
 * @modifier Kushalpreet Singh
 * Student number=991541546
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Random rand=new Random();
        Scanner input = new Scanner(System.in);
        Card luckyCard = new Card();
        
        
        for (int i=0; i<magicHand.length; i++)
        {
            int cardNumber=rand.nextInt(14)+1;
            int suitNumber=rand.nextInt(4);
            Card c = new Card();
            c.setValue(cardNumber);
            c.setSuit(Card.SUITS[suitNumber]);
            System.out.println("your card suit "+ c.getSuit());    
            System.out.println("your card number"+ c.getValue());    

        }

        System.out.println("Enter the suit for your card");
        String userGuess=input.nextLine();
        System.out.println("enter the number for your card");
        int num=input.nextInt();

           System.out.println("user card number "+num);
           System.out.println("user suits number "+userGuess );
        // and search magicHand here
        //Then report the result here
    }
    
}
