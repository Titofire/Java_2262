/**This Class tests the Person Class by creating a person, testing the getName
 * and toString methods.
 * @author Todd Poole
 */
package FamilyTree;

public class PersonTest
	{

		/**Main method for testing
		 * @param args
		 */
		public static void main(String[] args)
			{	//TODO Create person instance
				Person shaun = new Person ("Shaun");
				Person todd = new Person ("Todd");
				Person linda = new Person ("Linda");
				Person tony = new Person ("Tony");
				
				
				// test toSting
				
				System.out.println("Our Persons Name is -> " + todd);
				
				// test getName
				
				System.out.println("Testing the getName: " + todd.getName());
				
				// test 2nd Constructor
				
				Person patty = new Person("Patty", tony, linda);
				Person lisa = new Person("Lisa", tony, linda);
				Person thomas = new Person("Thomas", patty, shaun);
				
				
				//test getParents
				
				System.out.println("Pattys Parents are -> " + patty.getParents());
				
				//test numberChildren
				
				System.out.println("Tony has this many Children -> " + tony.numberChildren());
				
				//Section 4. Add a method getChildrenNames() that returns a list of strings
				//of the names of all the children. The method should return an empty list if there are no children.
				
				System.out.println("Tony's children are :" + tony.getChildrenNames());
				System.out.println("Lisa's children are :" + lisa.getChildrenNames());
				System.out.println("Linda's children are :" + linda.getChildrenNames());
				
				//Section 5. Test getGrandParents method
				
				System.out.println("Patty's GrandParents are: " + patty.getGrandParents());
				System.out.println("Thomas GrandParents are: " + thomas.getGrandParents());
				
				//Section 6. Test getGrandChildren method
				
				System.out.println("Linda's Grandchildren are : " + linda.getGrandChildren());
				
				//Section 7. Test Finding People
				
				System.out.println("Lets see if Todd is in the HashMap ->" + Person.findPerson("Todd"));  // returns boolean 
				
			}//end main
		

	}// end of class
