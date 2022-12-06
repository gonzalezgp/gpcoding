import java.util.Scanner;
public class BlackJack{
    Player Human;
    Player Computer;
    Deck deck;
    Scanner keyboard;
    
    public BlackJack(){
        Human = new Player("Human");
        Computer = new Player("Computer");
        Deck deck = new Deck();
        Scanner keyboard = new Scanner(System.in);
        
        //Deal initial hand
        Human.hit(deck.dealCard());
        Computer.hit(deck.dealCard());
        Human.hit(deck.dealCard());
        Computer.hit(deck.dealCard());
        
        int choice = 0;
        while(choice != 3){
            //inner loop continues while the player's are not bust and either
            //the human or the computer decides to keep hitting
            while (!isPlayerBust() && (choice!=2 || Computer.canHit())){
                System.out.println("Your score is currently " + Human.score());
                System.out.println("Your opponent is currently showing " + Computer.showFirstCard());
                System.out.println("Your opponent currently has " + Computer.handSize() + " cards total");
                System.out.println("");
                System.out.println("Make a choice");
                System.out.println("(1) Hit");
                System.out.println("(2) Stay");
                System.out.println("(3) Quit");
                System.out.println("");
                choice = keyboard.nextInt();
                if (choice == 1){
                    Human.hit(deck.dealCard());
                }
                if (Computer.canHit()){
                    Computer.hit(deck.dealCard());
                }
            }
            //shows the game result of who won
            gameResult();
            
            //resets the deck and the hands
            deck.shuffleDeck();
            Human.discardHand();
            Computer.discardHand();
            
            //Deal initial hand for next round.
            Human.hit(deck.dealCard());
            Computer.hit(deck.dealCard());
            Human.hit(deck.dealCard());
            Computer.hit(deck.dealCard());
            
            //sets up decisions for the next round.
            System.out.println("Your score is currently " + Human.score());
            System.out.println("Your opponent is currently showing " + Computer.showFirstCard());
            System.out.println("Your opponent currently has " + Computer.handSize() + " cards total");
            System.out.println("");
            System.out.println("Make a choice");
            System.out.println("(1) Hit");
            System.out.println("(2) Stay");
            System.out.println("(3) Quit");
            System.out.println("");
            choice = keyboard.nextInt();
        }
    }
    
    public boolean isPlayerBust(){
        return (Human.isBust() || Computer.isBust());
    }
    
    public void gameResult(){
        if (Computer.isBust()){
            System.out.println("You win!");
        }
        else if(Human.isBust()){
            System.out.println("You lose");
        }
        else if (Computer.score() > Human.score()){
            System.out.println("You lose!");
        }
        else if (Computer.score() < Human.score()){
            System.out.println("You win!");
        }
        else {
            System.out.println("You lose by tying with the house!");
        }
        
        System.out.println("Your hand: " + Human.score());
        System.out.println("Opponent hand: " + Computer.score());
        
    }
    
    public static void main(){
        new BlackJack();
    }
    
}