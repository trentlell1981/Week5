package Week5;

public interface Logger {
	
	/*
	 * This is the logger interface, it includes two primary methods listed below. Log & error. Upon doing research the 'message' and 'error message' are common to use with methods log & error, but in reality they could be named anything. When a class implements this interface they can provide their own logging mechanisms.
	 */
	
	void log(String message);
    void error(String errorMessage);

}
