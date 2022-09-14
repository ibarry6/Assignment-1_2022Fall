/**
 * 
 * @author Iburahima Barry
 *
 */
public class NoUpperAlphaException extends Exception {
	/**
	 * Constructor.
	 */
	public NoUpperAlphaException() {
		this("The password must contain at least one uppercase alphabetic character");
	}
	
	/**
	 * Parameterized constructor.
	 * @param message String message to be shown.
	 */
	public NoUpperAlphaException(String message) {
		super(message);
	}
}