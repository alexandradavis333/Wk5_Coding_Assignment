package log_Message;

public class asteriskLogger implements Logger {

	/**
	 * Want to print the message like this:
	 *  - *** msg ***
	 */
	
	@Override
	public String Log(String msg) {
		return "***" + msg + "***";
	}

	/**
	 * Want to print the message like this:
	 *  - ***********
	 *  - *** msg ***
	 *  - ***********
	 */
	
	@Override
	public String Error(String msg) {
		String middle = "***Error: " + msg + "***";
		String outer = "*".repeat(middle.length());
		String lf = System.lineSeparator();
		return outer + lf + middle + lf + outer;
	}

}
