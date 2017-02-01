package jGrasp;

public class TesterCh10 {
	public static void main (String []args){
		Cat fifi = new Cat();
		System.out.println(fifi.getLives());
		
	}

}

class Animal{
	protected int numLives;
	public Animal(){
		System.out.println("animal constructor called");
		numLives = 2;
	}
	
	public int getLives(){
		return numLives;
	}
}

class Mammal extends Animal{
	public Mammal(){
		System.out.println("mammal constructor called");
	}
	
}

class Cat extends Mammal{
	private boolean landsOnFeet;
	public Cat(){
		System.out.println("cat constructor called");
		numLives = 9;
		landsOnFeet  = true;
	}
}
