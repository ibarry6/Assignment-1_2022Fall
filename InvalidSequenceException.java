/**
 * 
 * @author Iburahima Barry 
 *
 */
public class InvalidSequenceException extends Exception {
	/**
	 * Constructor.
	 */
	public InvalidSequenceException() {
		this("The password cannot contain more than two of the same character in sequence.");
	}
	
	/**
	 * Parameterized constructor.
	 * @param message String message to be shown.
	 */
	public InvalidSequenceException(String message) {
		super(message);
	}
}