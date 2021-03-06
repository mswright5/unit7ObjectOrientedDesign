import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

/**
 * A triangle that is drawn by three clicks.
 * 
 * @author Matt Wright
 * @version February 11, 2015
 */
public class Triangle
{
    private double[] points;
    /**
     * Default constructor for objects of class Triangle
     */
    public Triangle(int[] point)
    {
        points = new double[6];
        for(int i = 0; i < point.length; i++)
        {
            points[i] = point[i];
        }
    }

    /**
     * Draws the triangle onto the Graphics2D object
     */
    public void draw(Graphics2D g2)
    {        
        //create the three sides of the triangle
        Line2D.Double line1 = new Line2D.Double(new Point2D.Double(points[0],points[1]),
                                                new Point2D.Double(points[2], points[3]));
        Line2D.Double line2 = new Line2D.Double(new Point2D.Double(points[2],points[3]),
                                                new Point2D.Double(points[4], points[5]));
        Line2D.Double line3 = new Line2D.Double(new Point2D.Double(points[4],points[5]),
                                                new Point2D.Double(points[0], points[1]));
                                     
        g2.draw(line1);
        g2.draw(line2);
        g2.draw(line3);
    }

}
