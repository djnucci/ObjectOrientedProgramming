package tutorial10;

public class CardMaxException extends Exception {

	public CardMaxException() {
	}

	public CardMaxException(String message) {
		super(message);
	}

	public CardMaxException(Throwable arg0) {
		super(arg0);
	}

	public CardMaxException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public CardMaxException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}
	
}
