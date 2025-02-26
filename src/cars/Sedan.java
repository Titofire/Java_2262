package cars;

public class Sedan extends Vehicle
	{

		public Sedan(CarCompany make, String model)
			{
				super(make, model);
				
			}
		/**
		 * Sets max passenger capacity for sedan at 3, not including driver
		 * @return 3 - number of passengers
		 */
		
		@Override
		public int getPassengerCapacity()
			{
				
				return 3;
			}
		
		
		
		/**
		 * Sets max cargo carrying capacity of sedan to 250
		 * @return 250 - maximum 
		 */
		@Override
		public int getCargoCapacity()
			{
				return 250;
			}
		
		
		/**
		 * This method returns average speed of a sedan
		 * @return 62
		 */
		@Override
		public int getAverageSpeed()
			{
				return 62;
			}
		/**
		 * This method returns the miles per gallon rating for the sedan
		 * @return 28
		 */
		public int getMPG()
		{
			return 28;
		}
	}// End of class
