package tutorial10;

public class ApprovedLimitException extends Exception{
	
	public ApprovedLimitException() {
	}

	public ApprovedLimitException(String message) {
		super(message);
	}

	public ApprovedLimitException(Throwable arg0) {
		super(arg0);
	}

	public ApprovedLimitException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public ApprovedLimitException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

}
