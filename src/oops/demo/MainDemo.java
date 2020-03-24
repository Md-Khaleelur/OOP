package oops.demo;

abstract class ObjectDemo{
	//Abstraction explanation
	abstract void capability();
}

class IntegerDemo extends ObjectDemo{

	//Encapsulation in class
	private String tipKey = "open";
	private String tipInput;
	int sum;
	
	public void setTipInput(String tipInput) {
		this.tipInput = tipInput;
	}
	
	void tip() {
		if(tipInput==tipKey) {
			System.out.println("TIP: Use short when the integer is not big to save the memory!");
		}
		else {
			System.out.println("Recheck your key to unlock the tip for Integers");
		}
	}
	
	//Overloading the add function [Polymorphism]
	void add(int firstNum,int secondNum) {
		sum=firstNum+secondNum;
		System.out.println("Adding the numbers "+firstNum+" and "+secondNum+" is "+sum);
	}
	
	void add(int firstNum, int secondNum, int thirdNum) {
		sum=firstNum+secondNum+thirdNum;
		System.out.println("Adding the numbers "+firstNum+" and "+secondNum+" and "+thirdNum+" is "+sum);
	}

	//Function overriding
	@Override
	void capability() {
		System.out.println("This Integer class performs addition");
	}	

}

class StringDemo extends ObjectDemo{
	//Inheriting StringDemo from ObjectDemo class
	private String tipKey = "open";
	private String tipInput;
	String result;
	
	public void setTipInput(String tipInput) {
		this.tipInput = tipInput;
	}
	
	void tip() {
		if(tipInput==tipKey) {
			System.out.println("TIP: Strings can be concatenated using + operator");
		}
		else {
			System.out.println("Recheck your key to unlock the tip for Strings");
		}
	}	
	
	void concat(String firstString, String secondString) {
		result=firstString+secondString;
		System.out.println("Concatenation of strings is "+result);
	}

	@Override
	void capability() {
		System.out.println("This String class performs concatenation");
	}
	
}

public class MainDemo {
	
	public static void main(String args[]) {
	
		IntegerDemo intObject = new IntegerDemo();
		intObject.capability();
		intObject.add(2, 3);
		intObject.add(3, 4, 5);
		intObject.setTipInput("open");
		intObject.tip();
		
		StringDemo  strObject = new StringDemo();
		strObject.capability();
		strObject.concat("Hello "," World");
		strObject.setTipInput("open");
		strObject.tip();
}
	
}
