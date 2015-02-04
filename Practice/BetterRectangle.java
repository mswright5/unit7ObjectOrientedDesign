import java.awt.Rectangle;

/**
 * A subclass of Rectangle that provides methods to get the perimeter and area of a rectangle
 * 
 * @author Matt Wright
 * @version February 2, 2015
 */
public class BetterRectangle extends Rectangle
{
    /**
     * Default constructor for objects of class BetterRectangle
     */
    public BetterRectangle(int locX, int locY, int sizeX, int sizeY)
    {
        super(locX, locY, sizeX, sizeY);
    }

    public double getPerimeter()
    {
        return (getWidth() * 2) + (getHeight() * 2);
    }
    
    public double getArea()
    {
        return (getWidth() * getHeight());
    }

}
