import java.util.GregorianCalendar;
public class Card
{
    private String name;

    public Card()
    {
        name = "";
    }

    public Card(String n)
    {
        name = n;
    }

    public String getName()
    {
        return name;
    }

    public boolean isExpired()
    {
        return false;
    }
    
    public boolean equals(Card other)
    {
        if(this.toString().equals(other.toString()))
        {
            return true;
        }
        
        return false;
    }

    public String format()
    {
        return "Card holder: " + name;
    }
    
    public String toString(){
        return "Card[Name:\""+name+"\"]";
    }
}