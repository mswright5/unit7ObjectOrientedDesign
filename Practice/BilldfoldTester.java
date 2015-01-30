

/**
 * Tests Billfold
 * 
 * @author  Matt Wright w/ Joe Deahr
 * @version (a version number or a date)
 */
public class BilldfoldTester
{
    /**Tests the functionality of Billfold */
    public static void main()
    {
        IDCard idcard = new IDCard("ID CARD", "12345");
        DriverLicense driverCard = new DriverLicense("Driver's License", 1998);
        Billfold bill = new Billfold();
        bill.addCard(idcard);
        bill.addCard(driverCard);
        System.out.println(bill.formatCards());
    }

}
