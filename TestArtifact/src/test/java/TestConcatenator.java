import static org.junit.Assert.*;

import org.junit.Test;

import saspenst.Concatenator;

public class TestConcatenator {

	@Test
	public void testConcatenateStrings() {
		
		Concatenator concatenator = new Concatenator();
		
		String firstString = "First";
		String secondString = "Second";
		
		String result = concatenator.concatenateStrings(firstString, secondString);
		
		assertEquals("First Second", result);
	}

}
