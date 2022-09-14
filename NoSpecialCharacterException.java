/**
 * 
 * @author Iburahima Barry
 *
 */
public class NoSpecialCharacterException extends Exception {
	/**
	 * Constructor.
	 */
	public NoSpecialCharacterException() {
		this(" The password must contain at least one special character");
	}
	
	/**
	 * Parameterized constructor.
	 * @param message String message to be shown.
	 */
	public NoSpecialCharacterException(String message) {
		super(message);
	}
}