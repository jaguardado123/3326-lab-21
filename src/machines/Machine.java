package machines;

public class Machine {
	// Attributes
	public String make;
	public String model;

	// Methods
	public void about() {
		System.out.println("This is a Machine.");
	}

	public Machine(String mk, String md) {
		make = mk;
		model = md;
	}

	public Machine() {}
}
