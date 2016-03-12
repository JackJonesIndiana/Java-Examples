package com.animals;

// The first line, ending with stop sign, is the one to be shown as the summary
/** 
 * <p>Implementation of a real world animal.</p>
 * <p><img src={@docRoot}/logo.png /></p>
 * <h3>Overview</h3>
 * <p>An animal can perform the following actions</p>
 * <ul>
 * <li>Walk</li>
 * <li>Roar</li>
 * <li>Sleep</li>
 * </ul>
 * <br>
 * <h3>Usage example</h3>
 * <pre>
 * {@code 
 * Animal animal = new Animal("name");
 * animal.roar(); 
 * }
 * </pre>
 * @author Sergio
 * @version 1.0
 * @since 07/02/2016
 * */

public class Animal {

	/**
	 * Size of an animal. The value of this constant is {@value}.
	 *
	 * */
	public static final int SIZE = 10;
	
	
	/**
	 * Creates a generic animal
	 * */
	public Animal(){
		
	}
	
	/**
	 * Creates a specific animal with the given name. Its size is {@value #SIZE}.
	 * @param name The name for the animal
	 * @see #setName
	 * */
	public Animal(String name){
		
	}
	
	
	/**
	 * Modifies the current name with the one passed as a parameter
	 * @param name The new name that will be set to this object
	 * */
	public void setName(String name){
		
	}
	
	/**
	 * Retrieve the current animal's name.
	 * @return The current animal's name
	 * */
	public String getName(){
		return "";
	}
	
	/**
	 * Make the animal roar
	 * @exception DontWannaRoarException Triggers an exception if the animal does not want to roar
	 * */
	public void roar(){
		
	}
	
	/**
	 * Make the animal walk
	 * */
	public void walk(){
		
	}
	
	/**
	 * Make the animal sleep
	 * @deprecated
	 * */
	public void sleep(){
		
	}
	
}
