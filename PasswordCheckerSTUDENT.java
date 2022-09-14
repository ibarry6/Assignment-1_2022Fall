
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


/**
 * STUDENT tests for the methods of PasswordChecker
 * @author Iburahima Barry
 *
 */
public class PasswordCheckerSTUDENT {

	public PasswordCheckerUtility passwordV;;
	String message="Aaabbaa@123";
	
	@Before
	public void setUp() throws Exception {
		passwordV= new PasswordCheckerUtility();
	}

	@After
	public void tearDown() throws Exception {
		passwordV=null;
	}

	/**
	 * Test if the password is less than 6 characters long.
	 * This test should throw a LengthException for second case.
	 */
	@Test
	public void testIsValidPasswordTooShort()
	{
		//fail("Not implemented by student yet");
		try{
		assertTrue(passwordV.hasBetweenSixAndNineChars("Ibrahi2#"));
		assertFalse(passwordV.hasBetweenSixAndNineChars("ibra"));
		}catch(LengthException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Test if the password has at least one uppercase alpha character
	 * This test should throw a NoUpperAlphaException for second case
	 * @throws  
	 */
	@Test
	public void testIsValidPasswordNoUpperAlpha()
	{
		//fail("Not implemented by student yet");
		try {
			assertTrue(passwordV.hasUpperAlpha(message));
			assertFalse(passwordV.hasUpperAlpha("ibrahima"));
		} catch (NoUpperAlphaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	/**
	 * Test if the password has at least one lowercase alpha character
	 * This test should throw a NoLowerAlphaException for second case
	 * @throws NoLowerAlphaException 
	 */
	@Test
	public void testIsValidPasswordNoLowerAlpha()
	{
		//fail("Not implemented by student yet");
		try {
			assertTrue(passwordV.hasLowerAlpha(message));
			assertFalse(passwordV.hasLowerAlpha("IBRAHIMA"));
		} catch (NoLowerAlphaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	/**
	 * Test if the password has more than 2 of the same character in sequence
	 * This test should throw a InvalidSequenceException for second case
	 */
	@Test
	public void testIsWeakPassword()
	{
		//fail("Not implemented by student yet");
		try {
			assertFalse(passwordV.isWeakPassword(message));
			assertTrue(passwordV.isWeakPassword("Ibrahim"));
		} catch (WeakPasswordException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * Test if the password has more than 2 of the same character in sequence
	 * This test should throw a InvalidSequenceException for second case
	 */
	@Test
	public void testIsValidPasswordInvalidSequence()
	{
		//fail("Not implemented by student yet");
		try {
			assertFalse(passwordV.hasSameCharInSequence(message));
			assertTrue(passwordV.hasSameCharInSequence("Ibraaahim"));
		} catch (InvalidSequenceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * Test if the password has at least one digit
	 * One test should throw a NoDigitException
	 */
	@Test
	public void testIsValidPasswordNoDigit()
	{
		//fail("Not implemented by student yet");
		try {
			assertTrue(passwordV.hasDigit(message));
			assertFalse(passwordV.hasDigit("Ibrahima"));
		} catch (NoDigitException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * Test correct passwords
	 * This test should not throw an exception 
	 */
	@Test
	public void testIsValidPasswordSuccessful()
	{
		//fail("Not implemented by student yet");
		try {
			assertTrue(passwordV.isValidPassword(message));
		} catch (NoDigitException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidSequenceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoLowerAlphaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSpecialCharacterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoUpperAlphaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	/**
	 * Test the invalidPasswords method
	 * Check the results of the ArrayList of Strings returned by the validPasswords method
	 */
	@Test
	public void testInvalidPasswords() {
		//fail("Not implemented by student yet");
		ArrayList<String> passwords=new ArrayList<>();
		passwords.add(message);
		passwords.add("brahim6");
		ArrayList<String> invalid= new ArrayList<>();
		invalid=PasswordCheckerUtility.getInvalidPasswords(passwords);
		System.out.print(PasswordCheckerUtility.getInvalidPasswords(passwords).get(0));
//		assertTrue(passwordV.getInvalidPasswords(passwords).contains(invalid));
		assertEquals(invalid.size(), 1);
		assertEquals(invalid.get(0), "brahim6 ->The password must contain at least one uppercase alphabetic character");
	}
	
}