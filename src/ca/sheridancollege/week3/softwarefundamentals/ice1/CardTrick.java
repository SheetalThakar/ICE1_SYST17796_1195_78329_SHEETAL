/*
 * JANHVI SHARMA
 * 991542217
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author janhvisharma
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        int a;
        String b;
      
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int)(Math.random()*13+1));
            c.setSuit(Card.SUITS[(int)(Math.random()*3+1)]);
            b=c.getSuit();
            a=c.getValue();
            System.out.println(a+"  "+b);
            magicHand[i]=c;
        }
        Scanner input= new Scanner(System.in);
       
        //insert code to ask the user for Card value and suit, create their card
        System.out.println("Enter a card number: ");
        int cardNumber= input.nextInt();
        input.nextLine();
        System.out.println("Enter card suit: ");
        String cardSuit= input.nextLine();
       
        System.out.println("Your card is: "+cardNumber+"  "+cardSuit);
        
        // and search magicHand here
        //Then report the result here
    }
    
}
