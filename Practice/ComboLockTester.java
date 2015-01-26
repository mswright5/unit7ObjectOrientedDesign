

/**
 * Tests the functionality of the ComboLock
 * 
 * @author  Matt Wright
 * @version January 26, 2015
 */
public class ComboLockTester
{
    /**
     * Main method
     *
     * @pre ComboLock works
     * @post    ComboLock works 
     */
    public static void main(String[] args)
    {
        ComboLock lock = new ComboLock(5, 10, 15);
        lock.turnRight(5);
        //lock.turnLeft(10);
        lock.turnLeft(10);
        lock.turnRight(15);
        System.out.print(lock.open());
    }

}
