/**
 * 
 */
package lectures;

/**
 * 
 * Mammal a child class (sub class) of Animal
 * @author ldamon
 *
 */
public class Mammal extends Animal {
	
	private String hairColor;
	
	/**
	 * @param initialWeight
	 * @param color
	 */
	public Mammal(double initialWeight, String color) {
		super(initialWeight);
		
		hairColor = color;
	}
	
	/**
	 * gets the hair color of this mammal
	 * @return the hair color
	 */
	public String getHairColor() {
		return hairColor;
	}
	
	/**
	 * sets the hair color for this mammal
	 * @param color color of the hair
	 */
	public void setHairColor(String color) {
		hairColor = color;
	}

}
