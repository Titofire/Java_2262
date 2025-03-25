/**
 * 
 */
package lectures;

/**
 * @author ldamon
 *
 */
public class Cat extends Mammal {
	
	private String breed;
	
	
	/**
	 * @param initialWeight 
	 * @param color 
	 * @param breed 
	 */
	public Cat (double initialWeight, String color, String breed) {
		super(initialWeight, color);
		
		this.breed = breed;
	}
	/**
	 * @return
	 */
	public String getBreed() {
		return breed;
	}
	
	/**
	 * @param newBreed 
	 */
	public void setBreed(String newBreed) {
		breed  = newBreed;
	}
	
	/**
	 * the sound the cat makes
	 */
	public String speak() {
		return "Meow";
	}

}
