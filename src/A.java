
public class A
	{
	     public void one(int a)
	         {  System.out.println("one-a="+a); }
	     
	         public int two(String b)
	         {  System.out.println("two-b=" +b); return 2; }
	         
	        public void both(String s)
	         { one(two(s)); }

	}
