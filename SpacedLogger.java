package Week5;

public class SpacedLogger implements Logger {
	
	
	/*
	 * this class also implements the logger interface. The log method uses a addSpaces private method that 
	 * i found to add spaces between each character. The error method also uses the addSpaces, and prefixes
	 * the formatted message with ERROR. 
	 */

	@Override
	public void log(String message) {
		 System.out.println(addSpaces(message));
	}

	@Override
	public void error(String errorMessage) {
		 System.out.println("ERROR: " + addSpaces(errorMessage));
	}

	 private String addSpaces(String text) {
	        return text.replaceAll("", " ").trim();
	 }
	
}
