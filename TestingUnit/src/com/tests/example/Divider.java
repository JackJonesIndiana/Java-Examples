package com.tests.example;

public class Divider {

	public float divide(float a, float b) throws UnsupportedDivisionException{
		if(b == 0){
			throw new UnsupportedDivisionException();
		}else{
			return a/b;
		}
	}

	@SuppressWarnings("serial")
	public class UnsupportedDivisionException extends Exception{
		
	}
	
}
