package cars;

public class TestVehicle
	{

		public static void main(String[] args)
			{	
						
				
				// Lets build anew Vehicle and carCompany
				CarCompany ford = new CarCompany("Ford");
				Sedan lisaSedan = new Sedan(ford, "Probe");
				
				//Test passenger and cargo capacity of Lisa's sedan.
				System.out.println(lisaSedan + " has a passanger capacity of: " + lisaSedan.getPassengerCapacity());
				System.out.println(lisaSedan + " has the cargo capacity of: " + lisaSedan.getCargoCapacity());
				
				
				// test setloadCargo, getAmountCargo, setloadPassengers, and getNumPassengers methods
				System.out.println(lisaSedan + " is a: " + lisaSedan);
				lisaSedan.setloadCargo(22);
				System.out.println(lisaSedan + " has this amount of Cargo: " + lisaSedan.getAmountCargo()); // 22 of cargo
				lisaSedan.setloadPassengers(2);
				System.out.println(lisaSedan + " has this many passangers: " + lisaSedan.getNumPassengers()); // 2 passengers
				
				//Test the unLoadPass, numUnloaded, and unloadCargo methods
				int numUnloadedPass = lisaSedan.unLoadPass();
				System.out.println(lisaSedan + " has unloaded all: " + numUnloadedPass + " passengers"); // 2 passengers
				System.out.println(lisaSedan + " now has this many passangers: " + lisaSedan.getNumPassengers());  // 0 passengers
				
				int numUnloadedCargo = lisaSedan.unLoadCargo(); // 22 of cargo
				System.out.println(lisaSedan + " has removed all " + numUnloadedCargo + " units of cargo."); // 22 of cargo
				System.out.println(lisaSedan + " now has " + lisaSedan.getAmountCargo() + " units of cargo."); // zero of cargo
				
				//Test getMPG and getAverageSpeed
				System.out.println(lisaSedan + " average speed is " + lisaSedan.getAverageSpeed() + " mph and miles per gallon is " + lisaSedan.getMPG());//62 and 28
				
				//Test transportPeople() for sedan to move 6 people to a destination 12 miles away; 
				lisaSedan.transportPeople(6,12);
				
				//Test transportCargo() for sedan to move 275 units of cargo 12 miles
				lisaSedan.transportCargo(275, 12);
				System.out.println();
				System.out.println();
				
				
				
				
				//******Test pickup truck class and methods********
				CarCompany chevy = new CarCompany("Chevy");
				PickupTruck toddTruck = new PickupTruck(chevy,"Silveraldo");
				
				//Test passenger and cargo capacity of Todd's Truck.
				System.out.println("Todds truck has a passanger capacity of: " + toddTruck.getPassengerCapacity());
				System.out.println("Todds truck has the cargo capacity of: " + toddTruck.getCargoCapacity());
				
				
				// test setloadCargo, getAmountCargo, setloadPassengers, and getNumPassengers methods
				System.out.println("Todds Truck is a: " + toddTruck);
				toddTruck.setloadCargo(650);
				System.out.println("Todds truck has this amount of Cargo: " + toddTruck.getAmountCargo()); // 650
				toddTruck.setloadPassengers(1);
				System.out.println("Todds truck has this many passangers: " + toddTruck.getNumPassengers()); // 1 passengers
				
				//Test the unLoadPass, numUnloaded, and unloadCargo methods
				int numUnloadedPassTrk = toddTruck.unLoadPass();
				System.out.println("Todds truck has unloaded all: " + numUnloadedPassTrk + " of is passengers"); // 1 passengers
				System.out.println("Todds truck now has this many passangers: " + toddTruck.getNumPassengers());  // 0 passengers
				
				int numUnloadedCargoTrk = toddTruck.unLoadCargo(); // 22 of cargo
				System.out.println("Todds Truck has removed all " + numUnloadedCargoTrk + " units of cargo."); // 650 of cargo
				System.out.println("Todds Truck now has " + toddTruck.getAmountCargo() + " units of cargo."); // zero of cargo
				
				//Test getMPG and getAverageSpeed
				System.out.println(toddTruck + " average speed is " + toddTruck.getAverageSpeed() + " mph and miles per gallon is " + toddTruck.getMPG());//62 and 28 
				
				
				//Test transportPeople() for Truck to move 6 people to a destination 12 miles away; 
				toddTruck.transportPeople(6,12); //Time 132 miles / 55 mph = 2.4hrs   Gas:132 miles / 21 mpg = 6.29 gallons
				
				//Test transportCargo() for truck to move 275 units of cargo 12 miles
				toddTruck.transportCargo(275, 12); //One trip, time:12 miles / 55mph = .22hrs, gas: 12 mile / 21 mpg = 0.57 gallons
				System.out.println();
				System.out.println();
				
				
				
				
				//*******Test SportCar Class and methods*************
				CarCompany honda = new CarCompany("Honda");
				SportsCar sportCar1 = new SportsCar(honda,"CRX");
				
				//Test passenger and cargo capacity of Todd's Truck.
				System.out.println("Sportcar1 has a passanger capacity of: " + sportCar1.getPassengerCapacity());
				System.out.println("Sportcar1 has the cargo capacity of: " + sportCar1.getCargoCapacity());
				
				
				// test setloadCargo, getAmountCargo, setloadPassengers, and getNumPassengers methods
				System.out.println("Sportcar1 is a: " + sportCar1);
				sportCar1.setloadCargo(61);
				System.out.println("Sportcar1 has this amount of Cargo: " + sportCar1.getAmountCargo()); // 61
				sportCar1.setloadPassengers(1);
				System.out.println("Sportcar1 has this many passangers: " + sportCar1.getNumPassengers()); // 1 passengers
				
				//Test the unLoadPass, numUnloaded, and unloadCargo methods
				int numUnloadedPassSportcar = sportCar1.unLoadPass();
				System.out.println("Sportcar1 has unloaded all: " + numUnloadedPassSportcar + " of is passengers"); // 1 passengers
				System.out.println("Sportcar1 now has this many passangers: " + sportCar1.getNumPassengers());  // 0 passengers
				
				int numUnloadedCargoSportCar = sportCar1.unLoadCargo();
				System.out.println("SportCar1 has removed all " + numUnloadedCargoSportCar + " units of cargo."); // 61 of cargo
				System.out.println("sportCar1 now has " + sportCar1.getAmountCargo() + " units of cargo."); // zero of cargo
				
				//Test getMPG and getAverageSpeed
				System.out.println(sportCar1 + " average speed is " + sportCar1.getAverageSpeed() + " mph and miles per gallon is " + sportCar1.getMPG());//72 and 24 
				
				//Test transportPeople() for sportCar to move 6 people to a destination 12 miles away; 
				sportCar1.transportPeople(6,12); //Time 132 miles / 72 mph = 1.83hrs   Gas:132 miles / 24 mpg = 5.5 gallons of fuel
				
				//Test transportCargo() for sportCar1 to move 275 units of cargo 12 miles
				sportCar1.transportCargo(275, 12);// 5 trips, * time: 12 miles / 72 mph = 0.83hrs, Gas: 60 miles / 24mpg = 2.5 gallons.
				System.out.println();
				System.out.println();
				
				
				
				//*******Test MotorCycle Class and methods*************
				CarCompany harleyDavidson = new CarCompany("Harley Davidson");
				MotorCycle motorCycle1 = new MotorCycle(harleyDavidson,"Street Glide");
				
				//Test passenger and cargo capacity of Todd's Truck.
				System.out.println(motorCycle1 + " has a passanger capacity of: " + motorCycle1.getPassengerCapacity());
				System.out.println(motorCycle1 + " has the cargo capacity of: " + motorCycle1.getCargoCapacity());
				
				
				// test setloadCargo, getAmountCargo, setloadPassengers, and getNumPassengers methods
				System.out.println(motorCycle1 + " is a: " + motorCycle1);
				motorCycle1.setloadCargo(11);
				System.out.println(motorCycle1 + " has this amount of Cargo: " + motorCycle1.getAmountCargo()); // 11
				motorCycle1.setloadPassengers(1);
				System.out.println(motorCycle1 + " has this many passangers: " + motorCycle1.getNumPassengers()); // 1 passengers
				
				//Test the unLoadPass, numUnloaded, and unloadCargo methods
				int numUnloadedPassMotorCycle = motorCycle1.unLoadPass();
				System.out.println(motorCycle1 + " has unloaded all: " + numUnloadedPassMotorCycle + " of it's passengers"); // 1 passengers
				System.out.println(motorCycle1 + " now has this many passangers: " + motorCycle1.getNumPassengers());  // 0 passengers
				
				int numUnloadedCargoMotorCycle = motorCycle1.unLoadCargo();
				System.out.println(motorCycle1 +" has removed all " + numUnloadedCargoMotorCycle + " units of cargo."); // 11 of cargo
				System.out.println(motorCycle1 + " now has " + motorCycle1.getAmountCargo() + " units of cargo."); // zero of cargo
				
				//Test getMPG and getAverageSpeed
				System.out.println(motorCycle1 + " average speed is " + motorCycle1.getAverageSpeed() + " mph and miles per gallon is " + motorCycle1.getMPG());//51 and 45 
				
				//Test transportPeople() for motorCycle to move 2 people to a destination 17 miles away; 
				motorCycle1.transportPeople(2,17); //Time: 51 miles / 51 mph = 1.00hrs   Gas:51 miles / 45 mpg = 1.13 gallons of fuel
				
				//Test transportCargo() for motorCycle1 to move 55 units of cargo 66 miles
				motorCycle1.transportCargo(55, 66);// Time: 3 trips * 66 miles / 51 mph = 3.88 hrs, Gas:  198 miles / 45mpg =  4.4 gallons.
				System.out.println();
				System.out.println();
				
			}

	}
