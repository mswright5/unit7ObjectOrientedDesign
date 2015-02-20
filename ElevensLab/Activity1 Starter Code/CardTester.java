/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card card1 = new Card("Jack","Hearts", 11);
		Card card2 = new Card("Jack","Hearts", 11);
		Card card3 = new Card("Not a Jack", "Hearts", 11);
		
		System.out.println(card1);
		System.out.println(card2);
		System.out.println(card3);
		
		System.out.println("\nCard 1");
		System.out.println(card1.suit());
		System.out.println(card1.rank());
		System.out.println(card1.pointValue());
		
		System.out.println("\nCard 2");
		System.out.println(card2.suit());
		System.out.println(card2.rank());
		System.out.println(card2.pointValue());
		
		System.out.println("\nCard 3");
		System.out.println(card3.suit());
		System.out.println(card3.rank());
		System.out.println(card3.pointValue());
		
		System.out.println();
		
		System.out.println(card1.matches(card2));
		System.out.println(card2.matches(card1));
		System.out.println(card2.matches(card3));
		System.out.println(card3.matches(card1));
	}
}
