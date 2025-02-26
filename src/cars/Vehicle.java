/**
 * This class creates vehicles with a make and model
 * @author Todd Poole
 */

package cars;

import java.text.NumberFormat;


public abstract class Vehicle
	{	
		// Instance variables...fields
		private CarCompany make;
		private String model;
		private int numPass;
		private int amtCargo;
		
		/**
		 * vehicle constructor builds a vehicle of a make and model
		 * @param make - the make (Ford, Chevy, etc.)
		 * @param model - the specific model of the car
		 */
		public Vehicle(CarCompany make, String model)
		{
			this.make = make;
			this.model = model;
			this.amtCargo = 0;
			this.numPass = 0;
			
		}
		
		/**
		 * returns the make or type of vehicle
		 * @return make
		 */
		public CarCompany getMake()
		{
			return make;
		}
		
		/**
		 * returns the specific model of the vehicle
		 * @return model
		 */
		public String getModel()
		{
			return model;
		}
		
		/**
		 * The max passengers not counting the driver fit in the vehicle
		 * @return integer - # of passengers
		 */
		public abstract int getPassengerCapacity();
		
		
		/**
		 * this is the max pounds of cargo the vehicle can carry
		 * @return integer - max cargo capacity
		 */
		public abstract int getCargoCapacity();
		
		/**
		 * This is returns how many persons are in the vehicle
		 * @return numberPass - number of passengers in vehicle
		 */
		public int getNumPassengers()
		{
			return numPass;
		}
		
		/**
		 * This returns the amount of Cargo in the vehicle
		 * @return amtCargo
		 */
		public int getAmountCargo()
		{
			return amtCargo;
		}
		
		/**
		 * Put passengers into the vehicle
		 * @param numberPass - the number of passengers to put into the vehicle
		 */
		public void setloadPassengers(int numberPass)
		{
			this.numPass += numberPass;
		}
		
		
		/**
		 * Put cargo into the vehicle
		 * @param addCargo
		 */
		public void setloadCargo(int addCargo)
		{
			this.amtCargo += addCargo;
		}
		
		/**
		 * this method will removes the passengers that were in the vehicle and returns that number then 
		 * sets the number of passengers to zero.
		 * @returns noPass
		 */
		public int unLoadPass()
		{	
			int noPass = getNumPassengers();
			this.numPass = 0;
					return noPass;
			
		}
		
		/**
		 * This method removes all cargo from vehicle and returns that number then sets the cargo to zero
		 * @return noCargo
		 */
		public int unLoadCargo()
		{
			int noCargo = getAmountCargo();
			this.amtCargo = 0;
				return noCargo;
			
		}
		
		
		/**
		 * This abstract method returns the average speed of a vehicle
		 * @return integer
		 */
		
		public abstract int getAverageSpeed();
		
		/**
		 * This abstract method returns the average miles per gallon rating
		 * @return integer
		 */
		public abstract int getMPG();
		
		
		
		
		/**
		 * Calculates the number of trips required, fuel requires and time required. 
		 * @param people - the number of people requiring transport
		 * @param miles - the number of miles to the destination
		 */
		public void transportPeople(int people, double miles)
		{	
			//House keeping: setup NumberFormat
			NumberFormat nf = NumberFormat.getNumberInstance();
			nf.setMaximumFractionDigits(2);
			
			int numberTrips = 0;
			if (people <= getPassengerCapacity()) // vehicle can handle all passengers so only one trip required.
				{
					numberTrips = 1;
					double gallonsGas = miles / getMPG();
					double time = miles / getAverageSpeed();
					System.out.println("You will need to make " + numberTrips + " passenger trip.");
					System.out.println("These passenger trips will use " + nf.format(gallonsGas) + "gallons of gas, and take " + nf.format(time) + " hours of travel time.");
				}
			 
			else if (people % getPassengerCapacity() == 0) //when their are more people than the vehicle can carry, but a multiple of getPassagnerCapacity().
				{
					numberTrips = people / getPassengerCapacity();
					numberTrips = numberTrips + (numberTrips - 1);
					double gallonsGas = numberTrips * (miles / getMPG());
					double time = numberTrips * (miles / getAverageSpeed());
					System.out.println("You will need to make " + numberTrips + " passenger trips.");
					System.out.println("These passenger trips will use " + nf.format(gallonsGas) + " gallons of gas, and take " + nf.format(time) + " hours of travel time.");
				}
			else // if modulus division !==0, when their are more people than the vehicle can carry,but #people is not a multiple of getPassangerCapacity().
				{
					numberTrips = 2 * (people / getPassengerCapacity());
					numberTrips ++;
					double gallonsGas = numberTrips * (miles / getMPG());
					double time = numberTrips * (miles / getAverageSpeed());
					System.out.println("You will need to make " + numberTrips + " passenger trip(s).");
					System.out.println("These passenger trips will use " +nf.format(gallonsGas) + " gallons of gas, and take " + nf.format(time) + " hours of travel time.");
				}		
		}
		
		
		/**
		 * Calculates the number of trips required, fuel requires and time required. 
		 * @param cargo - the number of people requiring transport
		 * @param cargoMiles - the number of miles to the destination
		 */
		public void transportCargo(int cargo, double cargoMiles)
		{	
			//House keeping: setup NumberFormat
			NumberFormat nf = NumberFormat.getNumberInstance();
			nf.setMaximumFractionDigits(2);
			
			int numberTrips = 0;
			if (cargo <= getCargoCapacity()) // vehicle can handle all cargo so only one trip required.
				{
					numberTrips = 1;
					double gallonsGas = cargoMiles / getMPG();
					double time = cargoMiles / getAverageSpeed();
					System.out.println("You will need to make " + numberTrips + " cargo trip.");
					System.out.print("These cargo trips will use " + nf.format(gallonsGas) + " gallons of gas, and take " + nf.format(time) + " hours of travel time.");
				}
			 
			else if (cargo % getCargoCapacity() == 0) //when their are more cargo than the vehicle can carry, but a multiple of getCargoCapacity().
				{
					numberTrips = cargo / getCargoCapacity();
					numberTrips = numberTrips + (numberTrips - 1);
					double gallonsGas = numberTrips * (cargoMiles / getMPG());
					double time = numberTrips * (cargoMiles / getAverageSpeed());
					System.out.println("You will need to make " + numberTrips + " cargo trips.");
					System.out.print("These cargo trips will use " + nf.format(gallonsGas) + " gallons of gas, and take " + nf.format(time) + " hours of travel time.");
				}
			else // if modulus division !==0, when their are more cargo than the vehicle can carry,but #of cargo is not a multiple of getCargoCapacity().
				{
					numberTrips = 2 * (cargo / getCargoCapacity());
					numberTrips ++;
					double gallonsGas = numberTrips * (cargoMiles / getMPG());
					double time = numberTrips * (cargoMiles / getAverageSpeed());
					System.out.println("You will need to make " + numberTrips + " cargo trip(s).");
					System.out.print("These cargo trips will use " +nf.format(gallonsGas) + " gallons of gas, and take " + nf.format(time) + " hours of travel time.");
				}		
		}
		
		
		@Override
		public String toString()
		{
			String result = "";
			result = make + " " + model;
			return result;
		}
		
		
	} //end of class
