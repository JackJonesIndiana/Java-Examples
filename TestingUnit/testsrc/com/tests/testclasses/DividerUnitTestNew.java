package com.tests.testclasses;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.tests.example.Divider;
import com.tests.example.Divider.UnsupportedDivisionException;

// No need to extend TestCase. Any class with a public zero-argument constructor can be used for tests
public class DividerUnitTestNew {

	/** Test written according to the JUnit 4 conventions */

	Divider divider = new Divider();

	@BeforeClass
	public static void beforeAnyMethod() {
		// There is nothing similar in JUnit 3
		System.out.println("Before any method of the class");
	}

	@BeforeClass
	public static void beforeAnyMethod2() {
		System.out.println("Annotations can be repeated");
	}

	@Before
	public void setUp() {
		// Equivalent to overriding setUp in JUnit 3
		System.out.println("Setting up");
	}

	@After
	public void tearDown() {
		// Equivalent to overriding tearDown in JUnit 3
		System.out.println("Cleaning up");
	}

	@AfterClass
	public static void afterAllMethods() {
		System.out.println("After all methods of the class");
	}

	
	@Test
	public void divideByValidPositiveAndNegativeValues() {
		System.out.println("Divide by positive and negative values");
		
		float res = 0;

		try {
			res = divider.divide(150, 15);
		} catch (UnsupportedDivisionException e) {
			fail("Unexpected exception");
		}

		assertEquals(res, 10, 0);

		res = 0;

		try {
			res = divider.divide(-150, 15);
		} catch (UnsupportedDivisionException e) {
			fail("Unexpected exception");
		}

		assertEquals(res, -10, 0);
	}

	
	
	@Test(expected = UnsupportedDivisionException.class)
	public void divideByZero() throws UnsupportedDivisionException{
		System.out.println("Divide by zero");
		divider.divide(150, 0);
	}

	
	@Ignore
	@Test
	public void ingoreTest(){
		System.out.println("Test being ignored");
	}
	
	
	@Test(timeout = 1)
	public void timeWithLimitedTime(){
		System.out.println("This test has to be finished sooner than a timeout");
		
		//Increase ITERS to make it fail
		final int ITERS = 1000;
		for (int i=0; i<ITERS; i++){
			Math.pow(1.25, 52);
		}
	}
	
}
