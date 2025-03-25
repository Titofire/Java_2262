/**
 * 
 */
package lectures;

/**
 * @author ldamon
 *
 */
public class Zoo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Animal aardvark = new Animal(10);
		System.out.println(aardvark.getWeight());
		
		aardvark.eat(.5);
		System.out.println(aardvark.getWeight());

		System.out.println();
		System.out.println("Now doing sophie stuff: ");
		Cat sophie = new Cat(16, "calico", "Maine Coon");
		System.out.println(sophie.getWeight());
		
		sophie.eat(.5);
		System.out.println(sophie.getWeight());	
		
		System.out.println();
		System.out.println("Now doing Koala stuff: ");
		Mammal koala = new Mammal(30, "tan");
		System.out.println(koala.getWeight());
		
		koala.eat(.5);
		System.out.println(koala.getWeight());	
	}

}
