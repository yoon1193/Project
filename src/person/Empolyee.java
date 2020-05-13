package person;

public class Empolyee {
	private int age;
	private String name;
	public Empolyee() {}
	public Empolyee(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public void cook() {
		
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

}
