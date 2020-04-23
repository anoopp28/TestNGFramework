package com.test;

import org.testng.annotations.Test;

public class ExpectedExceptions {
	
	
	@Test(expectedExceptions=NumberFormatException.class)
	public void TestWithExpecetingException() {
		
		String S = "100A";
		Integer.parseInt(S);
	}
	
	
	@Test()
	public void TestWithoutAcceptingException() {
		
		String S = "100A";
		Integer.parseInt(S);
	}

}
