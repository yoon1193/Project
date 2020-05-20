package person;

import java.util.Scanner;

import company.Hanshin;
import company.HongKong;
import company.Paikdabang;

public class Customer {
	Scanner sc = new Scanner(System.in);
	private int age;
	private String name;
	public Customer() {}
	public Customer(String name,int age) {
		this.age = age;
		this.name = name;
	}

	public void order(Employee e,int n,int m) {
		if(n == 1) {
			e.orderList.add(Hanshin.hanshinMenu[m-1]);
		}
		else if(n == 2) {
			e.orderList.add(HongKong.hongkongmenu[m-1]);
		}
		else{
			e.orderList.add(Paikdabang.paikdabangMenu[m-1]);
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
