package com.tests.mains;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import com.tests.testclasses.ParameterizedTest;

public class ParameterizedTestMain {

	public static void main(String [] args){
		
		Result result = JUnitCore.runClasses(ParameterizedTest.class);
		
		System.out.println();
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
