package com.tests.mains;

import java.util.Enumeration;

import com.tests.testclasses.DividerUnitTest;

import junit.framework.TestFailure;
import junit.framework.TestResult;

public class OldWithoutSuite {

	public static void main(String [] args){
		

		/*
		 * If a test is not given a name, you have to override the runTest method to execute your desired test methods.
		 * The execution order will always be: setUp -> runTests -> tearDown when you call the run method on a TestCase
		 * If you give a name to the TestCase, it must match the method name you want to execute (which is internally
		 * obtained via reflection. 
		 * Example: DividerUnitTest dividerTest = new DividerUnitTest("testDivideZeroDivider");
		 * */
		
		DividerUnitTest dividerTest = new DividerUnitTest(){

			@Override
			protected void runTest() throws Throwable {
				testDivideZeroDivider();
				testDivideValidPositiveAndNegativeValues();
			}
			
		};
		
		TestResult res = dividerTest.run();
		
		Enumeration<TestFailure> failures = res.failures();
		
		while(failures.hasMoreElements()){
			TestFailure failure = failures.nextElement();
			System.out.println(failure.exceptionMessage());
		}
		
		if(res.failureCount() == 0){
			System.out.println("Test passed");
		}else{
			System.out.println("Test didn't pass");
		}
		
	}
	
}
