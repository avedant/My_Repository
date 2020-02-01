package com.test;

import org.testng.annotations.Test;

public class ExceptionTimeoutTest {

	
	//@Test(invocationTimeOut=3,expectedExceptions=NumberFormatException.class)
	
	//public void infiniteLoopTest() {
		//int i=1;
		//while(i==1) {
			//System.out.println(i);
	//	}
		
	//}
	
	@Test(expectedExceptions=NumberFormatException.class)
	
	public void test1() {
		String x= "100A";
		
			Integer.parseInt(x);
	}
	
	
	
	
}
