/**
 * This class implements a person which shall be the top of the class hierarchy
 * in the family tree.
 * @author Todd Poole
 */
package FamilyTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Person
	{
		private String name;  // instance variable name
		private List<Person> children; // instance variable children type List of persons
		private Person parent1; // instance variables of both parents one and two of type Person
		private Person parent2;
		
		
		private static HashMap<String, Person> personIndex = new HashMap<String, Person>();
		
		public Person (String personName) // constructor for persons with UnKnown parents
		{
			this.name = personName;
			this.children = new ArrayList<>();
			this.parent1 = null;
			this.parent2 = null;
			personIndex.put(personName,this); // put this person into personIndex hashmap
			
		}
		
		public Person (String personName, Person mother, Person father) // Constructor for persons with known parents
		{	
			this(personName);
			this.parent1 = mother;
			this.parent2 = father;
			parent1.children.add(this);  // add this person to the parent1 (mother) children
			parent2.children.add(this);	 // add this person to the parent2 (father) children
			personIndex.put(personName,this); // put his person into hashmap
		}
		
		
		/**
		 * The getName method returns the persons name
		 * @return name
		 */
		public String getName()
		{
			return this.name;
		}
		
		
		
		/**
		 * This getParents method returns a set of parents stored in a HashSet. The returned set will include
		 * the parents of the fields are not null, but exclude any nulls.
		 * @return Set<Person>
		 */
		public Set<Person> getParents()
		{
			Set<Person> parents = new HashSet<>();
			
			if (parent1 != null)
				{
					parents.add(parent1);
				}
			
			if (parent2 != null)
				{
					parents.add(parent2);
				}
			
			return parents;
		}
		
		
		/**
		 * This numberChidren() method returns the number of children
		 * @return number of children
		 */
		public int numberChildren()
		{	
			int numberKids = children.size();
			
			return numberKids;
		}
		
		
		/**
		 * getChildrenNames() returns a list of strings of names of all the children. 
		 * @return  childrenNames of a parent. 
		 */
	    public List<String> getChildrenNames()
	    {
	    List<String> childrenNames = new ArrayList<>();  // Create an empty list to store children names
	    	
	    	for (Person child : children) 
	    	{
	    		childrenNames.add(child.getName());
	    	}
	    		return childrenNames;
	    }
	    
	    
	    
	    /**
	     * This method getGrandParents returns a set of people (Set<Person>) that are the 
	     * persons grandparents. This method will run an enhanced for loop over the parents from
	     * getParnents() and add their parents to the set. 
	     * @return grandParents
	     */
	    public Set<Person> getGrandParents()
	    {
	    	Set<Person> grandParents = new HashSet<>(); //New hashset to store grandParents
	    	
	    	for (Person parent : getParents()) // loops through the parents of the person
	    		{
	    			grandParents.addAll(parent.getParents()); // adds the parents of the parent to the grandParents hashset
	    		}
	    		return grandParents;
	    }
	    
	    /**
	     * This method getGrandChildren returns a set of people (Set<Person>) that are the persons grandChildren.
	     * @return grandChildren
	     */
	    public Set<Person> getGrandChildren()
	    {
	    	Set<Person> grandChildren = new HashSet<>();
	    	
	    	for (Person child : children)
	    		{
	    			grandChildren.addAll(child.children);
	    			
	    		}
	    	return grandChildren;
	    }
	    
	    /**
	     * Method findPerson() takes a string and returns the Person object with that name
	     * @param name - name of the person to find
	     * @return Boolean - true or false depending if Person is in the Hashmap
	     */
	    
	    public static Boolean findPerson(String name)
	    {
	    	return personIndex.containsKey(name);
	    }
		
		
		@Override 
		public String toString()
		{
			return this.name;
		}
		
		
		
	}//End of class