package person;

import java.util.ArrayList;

import Order.order;

public class Employee {
	private int age;
	private String name;
	public ArrayList<order> orderList = new ArrayList<>();
	public Employee() {}
	public Employee(int age, String name) {
		this.age = age;
		this.name = name;
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
