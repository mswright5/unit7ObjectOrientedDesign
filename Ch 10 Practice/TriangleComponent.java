import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import javax.swing.JComponent;
import java.util.Random;

/**
 * Class that creates instances of the classes that comprise the triangle and delegates drawing the
 *  triangle to these object.
 * 
 * @author Matt Wright
 * @version February 11 2015
 */
public class TriangleComponent extends JComponent
{
    /**
     * Allows the city to be viewed
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        Random generator = new Random();
        
    }

}
