package inheritance;

public class runner {

	public static void main(String[] args) {
		Car volkswagen = new Car("volkswagen", "golf", "black", "car", 10);
		Car ford = new Car("Ford", "fiesta", "red", "car", 9);
		Motorbike harley = new Motorbike("harley davidson", "dunno", "black", "motorbike", 5);
		Motorbike yamaha = new Motorbike("Yamaha", "dunno", "red", "motorbike", 3);

		// Create garage instance
		Garage newGarage = new Garage();

		// Adding vehicle to garage
		newGarage.addVehicleGarage(volkswagen);
		newGarage.addVehicleGarage(ford);
		newGarage.addVehicleGarage(harley);
		newGarage.addVehicleGarage(yamaha);

		// Object ID
		System.out.println(newGarage.getGarage());

		// Will need to re-do toString this is done in vehicle / car / motorbike class
		// otherwise will just print object
		newGarage.printVehicles();

		newGarage.printBrands();
	}

}
