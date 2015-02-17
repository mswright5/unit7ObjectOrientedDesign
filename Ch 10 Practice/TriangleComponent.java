import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

/**
 * Class that creates instances of the classes that comprise the triangle and delegates drawing the
 *  triangle to these object.
 * 
 * @author Matt Wright
 * @version February 11 2015
 */
public class TriangleComponent extends JComponent
{
    private int[] points;
    public TriangleComponent()
    {
        points = new int[6];
        this.addMouseListener(new MousePressListener());
    }

    /**
     * Allows the city to be viewed
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;

        Triangle triangle = new Triangle(points);
        boolean drawTriangle = true;
        for(int i = 0; i < points.length; i++)
        {
            if(points[i] == 0){drawTriangle = false;break;}
        }
        if(drawTriangle){triangle.draw(g2);}
        g2.setColor(Color.BLUE);

    }

    class MousePressListener implements MouseListener
    {
        public void mousePressed(MouseEvent event)
        {
            int x = event.getX();
            int y = event.getY();
            if(points[0] == 0){
                points[0] = x;
                points[1] = y;
            }

            else if(points[2] == 0){
                points[2] = x;
                points[3] = y;
            }

            else if(points[4] == 0){
                points[4] = x;
                points[5] = y;
            }
            else{
                for(int i = 0; i < points.length; i++)
                {
                    points[i] = 0;
                }
            }

            repaint();
        }

        public void mouseReleased(MouseEvent event){}

        public void mouseClicked(MouseEvent event){}

        public void mouseEntered(MouseEvent event){}

        public void mouseExited(MouseEvent event){}
    }

}
