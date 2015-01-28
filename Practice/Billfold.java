

/**
 * Holds 2 cards
 * 
 * @author Matt Wright w/ Joe Deahr 
 * @version January 28, 2015
 */
public class Billfold
{
    /** The two cards */
    private Card[] cards;

    /**
     * Default constructor for objects of class Billfold
     */
    public Billfold()
    {
    }
    
    public void addCard(Card card)
    {
        if (cards[0] == null){
            cards[0] = card;
        }
        
        else{
            cards[1] = card;
        }
    }
    
    public String formatCards()
    {
        return cards[0].format() + "\n" + cards[1].format();
    }

}
