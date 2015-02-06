import java.util.GregorianCalendar;

/**
 * Write a description of class DriverLicense here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DriverLicense extends Card
{
    /** The year the card expires */
    private int expiration;

    /**
     * Default constructor for objects of class DriverLicense
     */
    public DriverLicense(String n, int expire)
    {
        super(n);
        expiration = expire;
    }
    
    public boolean isExpired()
    {
        GregorianCalendar calendar = new GregorianCalendar();
        if (expiration < calendar.get(calendar.YEAR))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean equals(Card other)
    {
        if(this.toString().equals(other.toString()))
        {
            return true;
        }
        
        return false;
    }

    /**
     * Returns the formatted version of this class's description
     *
     * @return    description of this card
     */
    public String format()
    {
        return super.format() + "\nExpiration: " + this.expiration;
    }
    
    public String toString(){
        return "DriverLicense[Name:\""+getName()+"\"][Expiration:"+expiration;
    }

}
