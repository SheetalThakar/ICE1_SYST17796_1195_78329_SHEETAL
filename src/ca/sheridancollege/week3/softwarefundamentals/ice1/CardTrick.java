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
 * @author gagan
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        Card[] magicHand = new Card[7];
        Card luckycard=new Card();
        luckycard.setValue(2);
        luckycard.setSuite("Hearts");
        
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            int num1=(int) (Math.random()*13)+1;
            c.setValue(num1);
            int num2=(int)(Math.random()*3)+1;
            c.setSuit(Card.SUITS[num2]);
           // System.out.println(c.getValue()+c.getSuit());
            magicHand[i]=c;
            System.out.println("Enter the card value between 0 to 13:");
            int number=input.nextInt();
            System.out.println("Enter the suit value:");
            String number1=input.next();
            System.out.println("It is the number "+number+" of "+number1+" suite");
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }
    
}
