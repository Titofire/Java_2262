
public class C extends A
	{
		public int two(String b)
		      { System.out.println("Cb"+ b);
		        int x = super.two(b + "x");
		        System.out.println("C got "+x);
		        return x-4;
		      }
		
	}
