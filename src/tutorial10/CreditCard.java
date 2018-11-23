package tutorial10;
// Create the following three exception classes, each in its own class

// All are checked exceptions (inheriting from Exception)
// ApprovedLimitException
// CardMaxException
// FraudException

public class CreditCard {
	final private int MAX_LIMIT = 5000;
	private int credit;
	private String location;

	public CreditCard(int credit, String location) throws ApprovedLimitException {
		if (credit <= MAX_LIMIT) {
			this.credit = credit;
		}
		else {
			throw new ApprovedLimitException("You have gone over the limit.");
		}
		this.location = location;
	}
	
	private void subtractCredit(int purchaseAmount) throws CardMaxException {
		if ((credit -= purchaseAmount) < 0) {
			credit += purchaseAmount;
			throw new CardMaxException("You connnot withdraw that much.");
		}
	}
	

	public void purchase (int purchaseAmount, String location) throws FraudException, CardMaxException {
		if (this.location.equalsIgnoreCase(location)) {
			subtractCredit(purchaseAmount);
		}
		else {
			throw new FraudException("You are being suspected of fraud, please contact your local bank.");
		}
	}



	public static void main(String args[]) throws CardMaxException, FraudException, ApprovedLimitException {
		CreditCard card = new CreditCard(2500, "Toronto");
		card.purchase(500, "Toronto");

		 CreditCard card1 = new CreditCard(5000, "Toronto");
		 card1.purchase(5000, "Toronto");
		 card1.purchase(5000, "Atlanta");

		// try different combinations that trigger different exceptions
	}

}
