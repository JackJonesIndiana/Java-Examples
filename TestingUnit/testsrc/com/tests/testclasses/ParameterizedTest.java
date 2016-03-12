package com.tests.testclasses;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.tests.example.OddDetector;

@RunWith(Parameterized.class)
public class ParameterizedTest {

	public OddDetector detector = new OddDetector();
	
	private Integer testValue;
	private Boolean expectedResult;
	
	public ParameterizedTest(Integer testValue, Boolean expectedResult){
		this.testValue = testValue;
		this.expectedResult = expectedResult;
	}
	
	@Parameterized.Parameters
	public static Collection<Object []> getParams(){
		return Arrays.asList(new Object [][]{
			{0, false},
			{1, true},
			{4, false},
			{-4, false},
			{-5, true},
			{5, true}
		});
	}
	
	@Test
	public void oddNumbersOrNot(){
		// This test will be executed for every array that is inside the Collection returned by the static annotated method.
		// In each iteration, the constructor is called with the data in a row passed as argument.
		System.out.println("Input data: " + testValue);
		assertEquals(detector.isOdd(testValue), expectedResult);
	}
	
}
