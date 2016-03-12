package com.tests.mains;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import com.tests.testclasses.ExampleTestSuite;

public class NewWithSuite {

	public static void main(String [] args){
		
		Result result = JUnitCore.runClasses(ExampleTestSuite.class);
		
		// Note that JUnit 4 @Suite.SuiteClasses detects both @Test and methods starting by test* for compatibility with
		// the JUnit 3 version.
		
		System.out.println("Number of test cases that were run: " + result.getRunCount());
		System.out.println("Number of test cases ignored: " + result.getIgnoreCount());
		System.out.println("Number of test cases that failed: " + result.getFailureCount());
		
		for(Failure failure : result.getFailures()){
			System.out.println(failure.getMessage());
		}
		
		System.out.println("Unit cases successful: " + result.wasSuccessful());
		System.out.println("Execution time: " + result.getRunTime() + " ms");
	}
	
}
