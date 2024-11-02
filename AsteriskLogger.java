package Week5;

public class AsteriskLogger implements Logger {
	
	/*
	 * This class implements the logger interface. in the log method it formats standard messages by surrounding them with asterisks. The error method formats the message with pro and preceding asterisks as well as a border made of asterisks. Upon doing research this is done to distinguish error messages from standard messages.
	 */

	@Override
	public void log(String message) {
		System.out.println("***" + message + "***");
	}

	@Override
	public void error(String errorMessage) {
		String formattedMessage = "***ERROR: " + errorMessage + "***";
	    String border = "*".repeat(formattedMessage.length());
	    System.out.println(border);
	    System.out.println(formattedMessage);
	    System.out.println(border);
	}

}
