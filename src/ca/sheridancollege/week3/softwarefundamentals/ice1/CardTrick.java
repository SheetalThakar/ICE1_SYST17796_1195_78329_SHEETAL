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
 *@modifier  Nitika Dhawan
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
       
        Card[] magicHand = new Card[7];
        
        //get input from user
        Scanner sc= new Scanner (System.in);
        
        //ask user to pick a card
        System.out.println("Pick a card: ");
        int valueOfCard=sc.nextInt();
        
        sc.nextLine();
        //ask user to pick a suit
        System.out.println(" Enter suit: ");
        String suitOne=sc.nextLine();
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            
            //generate random value
            Random rand=new Random();
            int value=rand.nextInt((13-1)+1)+1;
            
             //c.setValue(insert call to random number generator here)
            c.setValue(value);
           
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            int suit=rand.nextInt((3-0)+1)+0;
            c.setSuit(Card.SUITS[suit]);
            
            System.out.println("Value"+c.getValue());
             System.out.println("Suit"+c.getSuit());

            magicHand[i]=c;
        }
        for(int i=0;i<magicHand.length;i++)
        {
         if(magicHand[i].getValue()==valueOfCard && magicHand[i].getSuit().equals(suitOne))
             
             System.out.println("Card present in magic hand");
             
         else
              System.out.println("Card not present in magic hand");
             break;
        }

        
        
        
            
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }
    
}
