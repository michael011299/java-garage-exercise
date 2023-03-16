package inheritance;

import java.util.ArrayList;
import java.util.List;

// extends -> "IS A" so car "IS A" vehicle but garage "Is NOT a" vehicle"
// garage "has a" vehicle so you just plonk vehicles in the class
class Garage {

	// Private variable, only accessible by getters and setters
	private List<Vehicle> garage = new ArrayList<>();

	public void addVehicleGarage(Vehicle v) {
		this.garage.add(v);
	}

	public List<Vehicle> getGarage() {
		return this.garage;
	}

	public void printVehicles() {
		for (Vehicle v : garage) {
			System.out.println(v);
		}
	}

	public void printBrands() {
		for (Vehicle v : garage) {
			// Runs through vehicles in garage and runs the getBrand method on each one
			System.out.println(v.getBrand());
		}
	}

}
