package Order;

import java.util.ArrayList;
import java.util.Scanner;

import company.Hanshin;
import company.HongKong;
import company.Paikdabang;
import person.Customer;
import person.Employee;

public class order {
	public String menu;
	public int price;
	public order() {}
	public order(String menu, int price) {
		this.menu = menu;
		this.price = price;
	}
	public void order() {
		Scanner sc = new Scanner(System.in);
		ArrayList<Employee> EmployeeList = new ArrayList<Employee>();
		EmployeeList.add(new Employee(20,"김한신"));
		EmployeeList.add(new Employee(21,"장한신"));
		EmployeeList.add(new Employee(22,"감한신"));
		ArrayList<Employee> EmployeeList1 = new ArrayList<Employee>();
		EmployeeList1.add(new Employee(20,"김홍콩"));
		EmployeeList1.add(new Employee(21,"장홍콩"));
		EmployeeList1.add(new Employee(22,"감홍콩"));
		ArrayList<Employee> EmployeeList2 = new ArrayList<Employee>();
		EmployeeList2.add(new Employee(20,"김다방"));
		EmployeeList2.add(new Employee(21,"장다방"));
		EmployeeList2.add(new Employee(22,"감다방"));
		ArrayList<Customer> customerList = new ArrayList<Customer>();

		
		System.out.println("손님의 이름과 나이를 입력");
		String name = sc.next();
		int age = sc.nextInt();
		Customer c1 = new Customer(name,age);
		customerList.add(c1);	
		System.out.println("1.h 2.hk 3.pd");
		int n = sc.nextInt();
		if(n==1) {
			Hanshin h = new Hanshin();
			h.setEmployeeList(EmployeeList);
			h.setCustomerList(customerList);
			System.out.println("주문하실 직원");
			for(int i=0; i<h.getEmployeeList().size();i++) {
				System.out.println((i+1)+". "+EmployeeList.get(i).getName());
			}
			int t = sc.nextInt();
			System.out.println("주문하기");
			h.showMenu();
			int m = sc.nextInt();
			Employee e = EmployeeList.get(t-1);
			c1.order(e,n,m);
			System.out.println(e.orderList.get(0).menu+" "+h.getSales());
		}
		
		else if(n==2) {
			HongKong hk = new HongKong();
			hk.setEmployeeList(EmployeeList1);
			hk.setCustomerList(customerList);
			System.out.println("주문하실 직원");
			for(int i=0; i<hk.getEmployeeList().size();i++) {
				System.out.println((i+1)+". "+EmployeeList1.get(i).getName());
			}
			int t = sc.nextInt();
			System.out.println("주문하기");
			hk.showMenu();
			System.out.println("3. 주문끝");
			int m = sc.nextInt();
			Employee e = EmployeeList1.get(t-1);
			c1.order(e,n,m);
			System.out.println(e.orderList.get(0).menu+" "+hk.getSales());
		}
		else{
			Paikdabang pd = new Paikdabang();
			pd.setEmployeeList(EmployeeList2);
			pd.setCustomerList(customerList);
			System.out.println("주문하실 직원");
			for(int i=0; i<pd.getEmployeeList().size();i++) {
				System.out.println((i+1)+". "+EmployeeList2.get(i).getName());
			}
			int t = sc.nextInt();
			System.out.println("주문하기");
			pd.showMenu();
			int m = sc.nextInt();
			Employee e = EmployeeList2.get(t-1);
			c1.order(e,n,m);
			System.out.println(e.orderList.get(0).menu+" "+pd.getSales());

		}
	}
}
