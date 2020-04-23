package com.test;

import org.testng.annotations.Test;

public class ExceptionTimeoutTest {

	@Test(timeOut=3000)
	public void infiniteloopTest() {
		int i = 1;
		while(i==1) {
			System.out.println(i);
		}
	}
	

}
