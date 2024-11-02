package Week5;

public class App {

	public static void main(String[] args) {
		
		/*
		 * This class serves as the entry point for the application and demonstrates the functionality. 
		 * It  uses a main method under which I have included both AsteriskLogger & SpacedLogger. As you can
		 * see when you run the application it produces the results we programmed in the other classes.
		 */
	
	     	Logger asteriskLogger = new AsteriskLogger();
	        Logger spacedLogger = new SpacedLogger();

	       
	        System.out.println("");
	        asteriskLogger.log("Hello");
	        System.out.println();
	        asteriskLogger.error("You have encountered an error");

	     
	        System.out.println("");
	        spacedLogger.log("Hello");
	        System.out.println();
	        spacedLogger.error("You have encountered an error");
	    }


}
