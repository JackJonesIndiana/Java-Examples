package com.tests.testclasses;

import com.tests.example.Adder;

import junit.framework.TestCase;

public class AdderUnitTest extends TestCase{

	Adder adder = new Adder();
	
	public AdderUnitTest(String fname){
		super(fname);
	}
	
	public void setUp(){
		System.out.println("Setting up");
	}
	
	public void tearDown(){
		System.out.println("Cleaning up");
	}
	
	public void testAdd(){
		float x = 5.5f, y = 10.5f;
		
		float res = adder.add(x, y);
		
		assertTrue("Adder not working properly", res == 16f);
	}
	
}
