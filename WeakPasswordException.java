/**
 * 
 * @author Iburahima Barry
 *
 */
public class WeakPasswordException extends Exception {
	/**
	 * Constructor.
	 */
	public WeakPasswordException() {
		this("The password is Ok but weak");
	}
	
	/**
	 * Parameterized constructor.
	 * @param message String message to be shown.
	 */
	public WeakPasswordException(String message) {
		super(message);
	}

}