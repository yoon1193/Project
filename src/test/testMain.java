package test;

import java.util.ArrayList;
import java.util.Scanner;

import company.Hanshin;
import company.HongKong;
import company.Paikdabang;
import person.Customer;
import person.Employee;

public class testMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		Customer customer = new Customer(19,"±è");
//		Customer customer1 = new Customer(19,"±è");
//		Customer customer2 = new Customer(19,"±è");
//		Customer customer3 = new Customer(19,"±è");
//		customer.order();
//		
//		System.out.println(customer.getAge());
//		Paikdabang paikdabang = new Paikdabang();
//		ArrayList<Employee> EmployeeList = new ArrayList<Employee>();
//		for(int i=0; i<EmployeeList.size();i++) {
//			System.out.println(EmployeeList.get(i));
//		}
//		EmployeeList.add(new Employee());
//		paikdabang.setEmployeeList(EmployeeList);
//		ArrayList<Customer> customerList = new ArrayList<Customer>();
		Hanshin h = new Hanshin();
		ArrayList<Employee> EmployeeList = new ArrayList<Employee>();
		EmployeeList.add(new Employee(20,"±èÇÑ½Å"));
		EmployeeList.add(new Employee(21,"±èµ¿½Å"));
		EmployeeList.add(new Employee(22,"±èº´½Å"));
		h.setEmployeeList(EmployeeList);
		ArrayList<Customer> customerList = new ArrayList<Customer>();
//		customerList.add(new Customer(20,"Á¤ÀçÀ±"));	
//		h.setCustomerList(customerList);
		System.out.println("ÀÌ¸§°ú ³ªÀÌ¸¦ ÀÔ·ÂÇØ");
		String s = sc.next();
		int a = sc.nextInt();
		Customer c1 = new Customer(a,s);
		customerList.add(c1);	
		h.setCustomerList(customerList);
		System.out.println("ÁÖ¹®ÇÏ½Ç Á÷¿ø");
		for(int i=0; i<h.getEmployeeList().size();i++) {
			System.out.println((i+1)+EmployeeList.get(i).getName());
		}
		int t = sc.nextInt();
		h.showMenu();
		Employee e = EmployeeList.get(t-1);
		c1.order(e,1);
		System.out.println(e.orderList.get(0).menu);
		System.out.println(h.getSales());
		
		
		
		
	}

}
