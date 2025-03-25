/**
 * This class is part of Measurable.java with is an interface
 */
public class Square implements Measurable
	{
		private double sideLength;  // 
		
		public  Square(double sideLength)   // Constructor
		{
			this.sideLength = sideLength;
		}
		
		/**
		 * This method returns one side of the square
		 * @return sideLength
		 */
		public double getSide()
		{
			return this.sideLength;
		}
		
		
		/**
		 * This method calculates the parameter of the square
		 * @return parameter
		 */
		@Override
		public double getPerimeter()
			{
				double perimeter = sideLength * 4;
				return perimeter;
			}

		@Override
		public double getArea()
			{
				double area = sideLength * sideLength;
				return area;
			}

		
	} //end of class
