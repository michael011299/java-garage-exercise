package inheritance;

class Vehicle extends Object {
	private String brand;
	private String model;
	private String colour;
	private String type;
	private int age;

	public Vehicle(String brand, String model, String colour, String type, int age) {
		super();
		// this.{INSTACE_VARAIABLE} = {VARIABLE}
		// Setting instance variables to passed in variables
		this.brand = brand;
		this.model = model;
		this.colour = colour;
		this.type = type;
		this.age = age;
	}

	public String getBrand() {
		return this.brand;
	}

	public void setName(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColour() {
		return this.colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}