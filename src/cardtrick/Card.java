/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardtrick;
import java.util.Random;

/**
 *
 * @author sivagamasrinivasan
 */
public class Card 
{
    private int numbers; //encapsulate it getters and setters
    private String suit;
    private int max = 10;
    private int min = 1;
    
    public static final String[] SUITS = {"diamonds","spades","clubs","hearts"};
    Random r = new Random();
    /**
     * @return the numbers
     */
    public int getNumbers() {
        return numbers;
    }

    /**
     * @param numbers the numbers to set
     */
    public void setNumbers(int numbers) {
        this.numbers = numbers;
    }

    /**
     * @return the suit
     */
    public String getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(String suit) {
        this.suit = suit;
    }
    
    public int genRanNum(){
        return (int)Math.floor(Math.random()*(max-min+1)+min);
    }
    
    public String genRanStr(){
        return SUITS[r.nextInt(SUITS.length)];
    }
}
