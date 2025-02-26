
public class PersonRunner
	{

		
		
		public static void main(String[] args)
		{
//		Person p1 = null;
//		p1.speak();
		
		Person p2 = new Person("Beth");
		Person p4 = new Person("Tito");
		Person p5 = new Person("Jill");
		p2.speak();
		Person p3 = p2;
		p2.speak();
		p2.setName("Frank");
		p3.speak();
		System.out.print("The number of persons is: " + Person.printCount());
		
		}
		
	}
		