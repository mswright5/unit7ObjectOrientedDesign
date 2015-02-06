

/**
 * Tests the BetterRectangle class
 * 
 * @author Matt Wright
 * @version February 2, 2015
 */
public class BetterRectangleTester
{
    /**
     * Main method to test BetterRectangle
     */
    public static void main()
    {
        BetterRectangle rectangle = new BetterRectangle(0,0,2,3);
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.getArea());
    }

}
