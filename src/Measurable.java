
/**
 * Interface Measurable is an exercise with interface types
 * @author ToddPoole
 */
public interface Measurable
	{
		public double getPerimeter();
		
		public double getArea();
		
		public default void display()
		{
			double perimeter = this.getPerimeter();
			double area = this.getArea();
			System.out.println("Perimeter = " + perimeter + "; area = " + area);
		}
		
	} //end of interface
