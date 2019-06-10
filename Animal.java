/*
 * How to name a class?
 * Name of class should always start with a capital letter (convention)
 * 
 */
public class Animal {
	
	/**
	 * Types of variables :
	 * integers, characters, string, float, boolean, short, 
	 * 
	 * Variables will have name :
	 * 
	 * variable will have value
	 * 
	 * variable name has to be written in camel case : it should start with letters or _
	 */
	
	//attributes - variables
	String name;
	int age;
	boolean isMarried; //camel case --> who is best --> whoIsBest
	float weight;
	
	//Behaviors : Methods -
	/**
	 * Name : camel case starting with small letters
	 * provide return type of the method
	 * A method can have 0 or more arguments
	 */
	
	void walk() {
		
		//no arguments
		//no value returned
		System.out.println("Animal is walking");
	}
	
	void speakName(String name) {
		// no value returned but argument taken
		System.out.println(name);
	}
	
	int addHundredToMyAge(int myAge) {
		// argument taken and value returned
		return myAge+100;
	}
}
