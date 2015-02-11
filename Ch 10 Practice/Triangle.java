import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;
import java.awt.geom.Line2D.Double;
import java.awt.geom.Point2D;

/**
 * A triangle that is drawn by three clicks.
 * 
 * @author Matt Wright
 * @version February 11. 2015
 */
public class Triangle
{
    /** description of instance variable x (add comment for each instance variable) */
    private Point2D point1, point2, point3;

    /**
     * Default constructor for objects of class Triangle
     */
    public Triangle()
    {
        // initialise instance variables
        point1 = new Point2D.Double(0,0);
        point2 = new Point2D.Double(0,0);
        point3 = new Point2D.Double(0,0);
    }
    
    /**
     * Draws the Road onto the Graphics2D object
     */
    public void draw(Graphics2D g2)
    {
        
        
    }

}
