
public class B extends A
	{
	     public void one(int a)
	         {  System.out.println("B has "+a);
	            super.one(a+2);
	            System.out.println("Goodbye B" );
	         }
	        public int two(String b)
	         { System.out.println("Bb" + b);
	         return 3;
	         }

	}
