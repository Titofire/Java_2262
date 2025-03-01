package cars;

public class MotorCycle extends Vehicle
	{

		public MotorCycle(CarCompany make, String model) //Constructor
			{
				super(make, model);
				
			}
		
		/**
		 * Sets max passenger capacity for MotorCycle at 1, not including driver
		 * @return 1 - number of passengers
		 */
		@Override
		public int getPassengerCapacity()
			{
				
				return 1;
			}
		
		
		/**
		 * Sets max cargo carrying capacity of MotorCycle to 40
		 * @return 40 - maximum 
		 */
		@Override
		public int getCargoCapacity()
			{
				return 40;
			}
		
		
		/**
		 * This method returns the average speed of the MotorCycle
		 * @return 51
		 */
		@Override
		public int getAverageSpeed()
			{
				return 51;
			}

		
		/**
		 * This method returns the miles per gallon rating of MotorCycl
		 * @return 45
		 */
		@Override
		public int getMPG()
			{
				return 45;
			}

	}
