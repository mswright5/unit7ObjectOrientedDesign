/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {
    /**
     * The main method in this class checks the Deck operations for consistency.
     *  @param args is not used.
     */
    public static void main(String[] args) {
        //Deck 1
        String[] ranks = new String[3];
        ranks[0] = "Jack"; ranks[1] = "Queen"; ranks[2] = "King";
    
        String[] suits = new String[2];
        suits[0] = "Club"; suits[1] = "Heart";
        
        int[] values = new int[3];
        values[0] = 10; values[1] = 11; values[2] = 12;
        
        Deck deck1 = new Deck(ranks,suits,values);
        
        //Deck 2
        ranks[0] = "Seven"; ranks[1] = "Eight"; ranks[2] = "Nine";
    
        suits[0] = "Spade"; suits[1] = "Diamond";
        
        values[0] = 7; values[1] = 8; values[2] = 9;
        
        Deck deck2 = new Deck(ranks,suits,values);
        
        //Deck 3
        ranks[0] = "Ace"; ranks[1] = "Two"; ranks[2] = "Three";
    
        suits[0] = "Spade"; suits[1] = "Diamond";
        
        values[0] = 1; values[1] = 2; values[2] = 3;
        
        Deck deck3 = new Deck(ranks,suits,values);
        
        System.out.println("Deck 1");
        System.out.println(deck1.size());
        System.out.println(deck1.isEmpty());
        System.out.println(deck1.deal());
        System.out.println(deck1.size());
        System.out.println(deck1.deal());
        System.out.println(deck1.deal());
        System.out.println(deck1.size());
        System.out.println(deck1.isEmpty());
        System.out.println(deck1.deal());
        System.out.println(deck1.deal());
        System.out.println(deck1.deal());
        System.out.println(deck1.size());
        System.out.println(deck1.isEmpty());
        System.out.println(deck1.deal());
        System.out.println(deck1.size());
        System.out.println("\n\n\n");
        
        System.out.println("Deck 2");
        System.out.println(deck2.size());
        System.out.println(deck2.isEmpty());
        System.out.println(deck2.deal());
        System.out.println(deck2.size());
        System.out.println(deck2.deal());
        System.out.println(deck2.deal());
        System.out.println(deck2.size());
        System.out.println(deck2.isEmpty());
        System.out.println(deck2.deal());
        System.out.println(deck2.deal());
        System.out.println(deck2.deal());
        System.out.println(deck2.size());
        System.out.println(deck2.isEmpty());
        System.out.println(deck2.deal());
        System.out.println(deck2.size());
        System.out.println("\n\n\n");
        
        System.out.println("Deck 3");
        System.out.println(deck3.size());
        System.out.println(deck3.isEmpty());
        System.out.println(deck3.deal());
        System.out.println(deck3.size());
        System.out.println(deck3.deal());
        System.out.println(deck3.deal());
        System.out.println(deck3.size());
        System.out.println(deck3.isEmpty());
        System.out.println(deck3.deal());
        System.out.println(deck3.deal());
        System.out.println(deck3.deal());
        System.out.println(deck3.size());
        System.out.println(deck3.isEmpty());
        System.out.println(deck3.deal());
        System.out.println(deck3.size());
    }
}
