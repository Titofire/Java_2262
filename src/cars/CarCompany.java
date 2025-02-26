package cars;

/**
 * This class will hold the car company
 * @author Todd Poole
 */
public class CarCompany
	{
		private String carCompany;
		
		/**
		 * This builds a carCompany
		 * @param carCompany
		 */
		public CarCompany(String carCompany)
			{
				this.carCompany = carCompany;	
			}
		
		
		/**
		 * this method returns the carCompany
		 * @return result
		 */
		@Override
		public String toString()
		
		{
			//String result;
			//result = carCompany;
			return carCompany;
		}
		
		
		
	}// End of Class

