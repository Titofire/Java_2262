
public class Person
	{
	
		private String name;
		private static int count = 0;
		
		public Person(String name)
		{
		this.name = name;
		printCount();
		}
		
		
		
		public void setName(String name)
		{
		this.name = name;
		}
		
		
		public String getName()
		{
		return name;
		}
		
		
		public void speak()
		{
		System.out.println("My name is " + name);
		}
		
		public static int printCount() 
		{
			count ++;
			return count;
		}
		@Override
		public String toString()
		{
			String result = "";
			result += "The number of Students is :" + count;
			return result;
		}
	}
	
