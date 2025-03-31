/**
 * Exception for when vehicle capacity exceeds manufacturers recommendations.
 * @author Todd Poole 
 */
package cars;

public class CapacityExceedException extends Exception
	{
		
		/**
		 * generic method
		 */
		public CapacityExceedException(){}
			
		/**
		 * 
		 * @param message 
		 */
		public CapacityExceedException(String message)  // commenting out this constructor will enable only a stack trace without my custom message
			{
				super(message);
				
			}

	}
