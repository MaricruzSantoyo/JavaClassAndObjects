
public class Pet {

	// Private name, age, location, and type:

	private String name;
	private int age;
	private String location;
	private String type;

	// two empty constructors (empty, all attributes):

	// Number one:

	Pet() {

	}

	// Number two:
	Pet(String name, int age, String location, String type) {
		this.name = name;
		this.age = age;
		this.location = location;
		this.type = type;
	}

	// access to Get Methods:
	// name, age, type

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getType() {
		return type;
	}

	// Set Methods that are able to be changed:
	// name, age, location

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setLocation(String location) {
		this.location = location;
	}
}
