

/**
 * Subclass of Card that holds an a card number and a pin
 * 
 * @author Matt Wright w/ Joe Deahr
 * @version January 28, 2015
 */
public class CallingCard extends Card
{
    /** Holds the ID of the card */
    private String number, pin;

    
    /**
     * Default constructor for objects of class CallingCard, accepting a name, number, and pin
     */
    public CallingCard(String n, String num, String pin)
    {
        super(n);
        number = num;
        this.pin = pin;
    }

    /**
     * Returns the formatted version of this class's description
     *
     * @return    description of this card
     */
    public String format()
    {
        return super.format() + "\nCard Number: " + this.number + " \nPin: " + this.pin;
    }

}
