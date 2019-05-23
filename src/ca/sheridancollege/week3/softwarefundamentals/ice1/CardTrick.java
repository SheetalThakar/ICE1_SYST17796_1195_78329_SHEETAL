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
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int)(Math.random()* 13 + 1));
            c.setSuit(Card.SUITS[(int) (Math.random() *  4)]);
            
            magicHand[i] = c;
            
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        
        for(int i = 0; i < magicHand.length; i++){
            System.out.println(magicHand[i].getValue() + " of " + magicHand[i].getSuit());
        }
        
        Scanner input = new Scanner(System.in);
        
        Card cardObject = new Card();
        
        System.out.println("Enter a number between 1 and 13: ");
        int userInput = input.nextInt();
        
        System.out.println("Enter a suit: ");
        String suitInput = input.next();
        
        System.out.println("user picked Card: " + cardObject.getValue() + " of "
                         + cardObject.getSuit());
        
        Card luckyCard = new Card();
        luckyCard.setValue(2);
        luckyCard.setSuit("Heart");
        
        System.out.println("Lucky Card Contains: " + luckyCard.getValue() + " of " + luckyCard.getSuit());
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }
    
}
