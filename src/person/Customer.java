package person;

import java.util.Scanner;

import company.Hanshin;

public class Customer {
	Scanner sc = new Scanner(System.in);
	private int age;
	private String name;
	public Customer() {}
	public Customer(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public void order(Employee e,int n) {
		if(n == 1) {
			e.orderList.add(Hanshin.hm[1]);
		}
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
