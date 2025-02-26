package cars;

public class PickupTruck extends Vehicle
	{

	public PickupTruck(CarCompany make, String model)
		{
			super(make, model);
			
		}
	
	/**
	 * How many passengers not counting the driver fit in the pickup truck
	 * @return 1 - only one passenger allowed
	 */
	@Override
	public int getPassengerCapacity()
	{
		return 1;
	}
	
	/**
	 * this is the max pounds of cargo the pickup truck can carry
	 * @return maxCargo - 1000 max units of cargo
	 */
	@Override
	public int getCargoCapacity()
	{
		return 1000;
	}
	
	
	/**
	 * Returns average speed of PickupTruck
	 * @return	55
	 */
	@Override
	public int getAverageSpeed()
		{
			return 55;
		}
	
	/**
	 * This method returns the miles per gallon rating of the PickupTruck
	 * @return 21
	 */
	@Override
	public int getMPG()
	{
		return 21;
	}

	}// End of Class
