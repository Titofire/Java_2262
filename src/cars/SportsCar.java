package cars;

public class SportsCar extends Vehicle

	{
		public SportsCar(CarCompany make, String model)
		{
			super(make, model);
			
		}
		
		/**
		 * returns 

 capacity of SportsCare
		 * @return 1
		 */
		@Override
		public int getPassengerCapacity()
		{
			return 1;
		}
		
		/**
		 * return cargo capacity of SportsCar
		 * @return 100
		 */
		@Override
		public int getCargoCapacity()
		{
			return 100;
		}
		
		
		/**
		 * This method returns the average SportCar speed
		 * @return 72
		 */
		@Override
		public int getAverageSpeed()
			{
				
				return 72;
			}
		/**
		 * This method returns the miles per gallon rating for a sports care
		 * @return 24
		 */
		public int getMPG()
		{
			return 24;
		}
		
		
	}// end of class


