
public class Personne {
	
	private String firstname;
	private String lastname;
	private String sex;
	private int age;
	private int weight;
	private int height;
	
	public Personne(  String Firstname, String Lastname, String Sex, int Age, int Weight, int Height) {
		this.firstname = Firstname;
		this.lastname = Lastname;
		this.sex = Sex;
		this.age = Age;
		this.weight = Weight;
		this.height = Height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int bob) {
		this.weight = bob;
	}
	
}
