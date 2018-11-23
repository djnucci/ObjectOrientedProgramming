package tutorial10;

public class FraudException extends Exception{

	public FraudException() {
	}

	public FraudException(String message) {
		super(message);
	}

	public FraudException(Throwable arg0) {
		super(arg0);
	}

	public FraudException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public FraudException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}
	
}
