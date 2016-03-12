package com.tests.testclasses;

import com.tests.example.Divider;
import com.tests.example.Divider.UnsupportedDivisionException;

import junit.framework.TestCase;

public class DividerUnitTest extends TestCase{
  
	/** This is a test that follows the JUnit 3.0 way of writing tests */
	
	Divider divider = new Divider();
	
	public DividerUnitTest(String fname){
		super(fname);
	}
	
	public DividerUnitTest(){
		super(null);
	}
	
	public void setUp(){
		System.out.println("Setting up the test");
	}
	
	public void tearDown(){
		System.out.println("Cleaning up");
	}
	
   public void testDivideValidPositiveAndNegativeValues() {
      
	   float res = 0;
	   
	   try{
		   res = divider.divide(150, 15);
	   }catch(UnsupportedDivisionException e){
		   fail("Unexpected exception");
	   }
      
	   assertEquals(res, 10, 0);
      
	   res = 0;
	   
	   try{
		   res = divider.divide(-150, 15);
	   }catch(UnsupportedDivisionException e){
		   fail("Unexpected exception");
	   }
	   
      assertEquals(res, -10 , 0);
   }
   
   public void testDivideZeroDivider(){
	   
	   try{
		   divider.divide(150, 0);
	   }catch(UnsupportedDivisionException e){
		   // OK 
		   return;
	   }catch(Exception e){
		   fail("Unexpected exception");
	   }
	   
	   fail("Exception was not thrown");
   }
   
}