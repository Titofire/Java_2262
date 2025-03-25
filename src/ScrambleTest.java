
public class ScrambleTest
	{

		public static void main(String[] args)
			{
				A a = new A();
				B b = new B();
				C c = new C();
				D d = new D();
				a.both("w");
				b.both("x");
				c.both("y");
				d.both("z");
				a = c;
				a.both("ac");


			}

	}
