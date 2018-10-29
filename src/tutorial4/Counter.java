//100655384 - Daniel Nucci

package tutorial4;

public class Counter {
	private int tally = 0;

	/**
	 * Empty constructor
	 */
	public Counter() {
	}

	/**
	 * adds one to the tally
	 */
	public void click() {
		tally++;
	}

	/**
	 * getter for the tally
	 * @return
	 */
	public int getValue() {
		return tally;
	}

	public static void main(String[] args) {
		// create Counter object
		Counter c = new Counter();
		// increase the tally count by 2
		c.click();
		c.click();
		// print the value of the tally
		System.out.println("Value of ticker: " + c.getValue());
	}
}
