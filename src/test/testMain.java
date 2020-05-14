package test;

import java.util.ArrayList;

import company.Hanshin;
import company.HongKong;
import company.Paikdabang;
import person.Customer;
import person.Empolyee;

public class testMain {

	public static void main(String[] args) {
		Customer customer = new Customer(19,"±è");
		Customer customer1 = new Customer(19,"±è");
		Customer customer2 = new Customer(19,"±è");
		Customer customer3 = new Customer(19,"±è");
	
		Paikdabang paikdabang = new Paikdabang();
		ArrayList<Empolyee> empolyeeList = new ArrayList<Empolyee>();
	
		for(int i=0; i<empolyeeList.size();i++) {
			System.out.println(empolyeeList.get(i));
		}
		paikdabang.setEmpolyeeList(empolyeeList);
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		
	}

}
