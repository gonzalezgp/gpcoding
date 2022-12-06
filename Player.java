import java.util.ArrayList;

public class Player{
    //instance variables
    
    public Player(String n){
        //fill out the constructor for a player 
        //including a name and a blank arraylist as a hand
    }
    
    //sums up the score in your hand (arraylist).
    int score(){
        
    }
    
    //adds a card to the hand.
    void hit(int card){
        
    }
    
    //returns true if your hand is bust (a score over 21).
    boolean isBust(){
        
    }
    
    //logic for when the house will choose to hit or not
    boolean canHit(){
        return score() < 17;
    }
    
    //shows the first card in the hand that is face up.
    int showFirstCard(){
        
    }
    
    //returns the number of cards in your hand.
    int handSize(){
        
    }
    
    //removes all of the cards in your hand
    void discardHand(){
        
    }
    
}
