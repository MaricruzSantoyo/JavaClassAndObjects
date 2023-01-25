
public class Films {

	// Minimum 3 private instance variables
	private String name;
	private int year;
	private String director;
	private String producer;

	// an empty constructor
	Films() {

	}

	// a constructor using only 2 of the variables
	Films(String director, String producer) {
		this.director = director;
		this.producer = producer;
	}

	// a constructor that uses all instance variables
	Films(String name, int year, String director, String producer) {
		this.name = name;
		this.year = year;
		this.director = director;
		this.producer = producer;
	}

	// get methods for all instance variables
	public String getName() {
		return name;
	}

	public int getYear() {
		return year;
	}

	public String getDirector() {
		return director;
	}

	public String getProducer() {
		return producer;
	}

	// set methods for all instance variables

	public void setName(String name) {
		this.name = name;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	// method returning a boolean

	public boolean isNewFilm() {
		return true;
	}

	// method returning a string

	public String FilmInfo() {
		return "Welcome! Ready to add a new film?";
	}

}
