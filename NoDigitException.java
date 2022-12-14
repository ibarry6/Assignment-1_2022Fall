/**
 * 
 * @author Iburahima Barry
 *
 */
public class NoDigitException extends Exception {
	/**
	 * Constructor.
	 */
	public NoDigitException() {
		this("The password must contain at least one digit.");
	}
	
	/**
	 * Parameterized constructor.
	 * @param message String message to be shown.
	 */
	public NoDigitException(String message) {
		super(message);
	}
}