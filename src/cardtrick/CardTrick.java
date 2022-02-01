//VAN TRONG HIEU NGUYEN//
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardtrick;
import java.util.*;
/** step 1: generate 7 random cards and store in array 
 * 52 deck size: 
 * 2 spades
 * 5 hearts
 * 1 clubs
 * ... 7 cards
 *
 * @author sivagamasrinivasan
 */
public class CardTrick {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
      Scanner in = new Scanner(System.in);
      Card[] magicHand = new Card[7]; //Array of object
      Card c = new Card();
      Card luckyCard = new Card();
      System.out.println("The cards are: ");
      for (int i=0;i<magicHand.length;i++)
      
      {
        // step 1: generate 7 random cards and store in array
          
          c.setNumbers(c.genRanNum());//random generation for number/use method
          c.setSuit(c.genRanStr());
          magicHand[i]=c; // stores the card object  in array
          System.out.println(magicHand[i].getNumbers() + " of " + magicHand[i].getSuit());
    }
        luckyCard.setNumbers(2);
        luckyCard.setSuit("spades");
    System.out.println("Type in the card suit");
    String suitSelect = in.nextLine();
    System.out.println("Type in the card number from 1 to 10");
    int numSelect = in.nextInt();
    }
}
    
      //step 2: take input guess the card 2 spades find in array - print your card is found
    // step 3 do change in remote repository. hard coded card details card number =2,hearts to find in array
    
    
    

