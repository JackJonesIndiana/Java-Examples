package com.tests.mains;

import java.util.Enumeration;

import com.tests.testclasses.AdderUnitTest;
import com.tests.testclasses.DividerUnitTest;

import junit.framework.TestFailure;
import junit.framework.TestResult;
import junit.framework.TestSuite;

public class OldWithSuite {

	public static void main(String [] args){
		
		// Way number 1 -> Specify explicitly the test methods to execute: 
		TestSuite suite = new TestSuite();
		suite.addTest(new DividerUnitTest("testDivideValidPositiveAndNegativeValues"));
		suite.addTest(new DividerUnitTest("testDivideZeroDivider"));
		suite.addTest(new AdderUnitTest("testAdd"));
		
		System.out.println("Cases: " + suite.countTestCases());
		
		TestResult res = new TestResult();
		suite.run(res);
		
		Enumeration<TestFailure> failures = res.errors();
		
		while(failures.hasMoreElements()){
			System.out.println(failures.nextElement().exceptionMessage());
		}
		
		System.out.println("Success: " + res.wasSuccessful());
		
		
		System.out.println();
		System.out.println();
		
		
		// Way number 2 -> Automatically detect test cases by collecting methods starting by test in the TestCase classes passed as argument: 
		suite = new TestSuite(DividerUnitTest.class, AdderUnitTest.class);
		
		System.out.println("Cases: " + suite.countTestCases());
		
		res = new TestResult();
		suite.run(res);
		
		failures = res.errors();
		
		while(failures.hasMoreElements()){
			System.out.println(failures.nextElement().exceptionMessage());
		}
		
		System.out.println("Success: " + res.wasSuccessful());
	}
	
}
