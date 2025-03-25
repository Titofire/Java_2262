
/**This class models a equilateral triangle
 * @author Todd Poole
 */
public class EqTriangle implements Measurable
	{
		private double triSide; //Instance variables / fields
		private double triHeight;
		
//		public EqTriangle(double triSide, double triHeight) //Constructor
//			{
//			this.triSide = triSide;
//			this.triHeight = triHeight;
//			}
		
		public EqTriangle(double triSide)
		{
			this.triSide = triSide;
			this.triHeight = (Math.sqrt(3) / 2) * triSide;
			
		}
		
		public double getBase()
		{
			return this.triSide;
		}
		
		public double getHeight()
		{
			return this.triHeight;
		}
		
		
		@Override
		public double getPerimeter()
			{
				double perimeter = triSide * 3;
				return perimeter;
			}
		
		
		@Override
		public double getArea()
			{
				double area = (triSide * triHeight) / 2;
				return area;
			}
		
		

	}// End of Class
