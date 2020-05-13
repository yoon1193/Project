package person;

public class Customer {
	private int age;
	private String name;
	public Customer() {}
	public Customer(int age, String name) {
	
		this.age = age;
		this.name = name;
	}

	public void order() {
		
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
