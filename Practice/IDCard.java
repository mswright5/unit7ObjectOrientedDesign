

/**
 * Subclass of Card that holds an ID
 * 
 * @author Matt Wright w/ Joe Deahr
 * @version January 28, 2015
 */
public class IDCard extends Card
{
    /** Holds the ID of the card */
    private String idNumber;

    
    /**
     * Secondary constructor for objects of class IDCard, accepting a name
     */
    public IDCard(String n, String id )
    {
        super(n);
        idNumber = id;
    }

    /**
     * Returns the formatted version of this class's description
     *
     * @return    description of this card
     */
    public String format()
    {
        return super.format() + "/nID: " + this.idNumber;
    }

}
