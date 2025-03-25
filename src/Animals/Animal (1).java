/**
 * 
 */
package lectures;

/**
 * 
 * Top level class to demonstrate inheritance
 * a relationship between a general class and a more specific class
 * 
 * IS-A relationship
 * 
 * Cat is-a Animal
 * Mammal is-a Animal
 * Cat is-a Mammal
 * 
 * Animal is a super class (parent class) of Cat 
 * Cat is a subclass (child class) of Animal
 * 
 * polymorphism
 * 
 * @author ldamon
 *
 */
public class Animal {
   
	private double weight;
	
	
	/** 
	 * @param initialWeight initial weight of animal when born
	 */
	public Animal (double initialWeight) {
		weight = initialWeight;
	}
	
	/**
	 * gets the weight of the Animal
	 * @return the weight
	 */
	public double getWeight()
	{
		return weight;
	}
	
	/**
	 * the sound an animal makes
	 * @return the sound
	 */
	public String speak()
	{
		return "";
	}
	
	/**
	 * a method to feed the animal
	 * @param mass the amoutn of food we are feeding our animal
	 */
	public void eat(double mass)
	{
		weight += .5*mass;
		System.out.println(this.speak());
	}
}
