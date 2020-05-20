package test;

import java.util.ArrayList;
import java.util.Scanner;

import Order.order;
import company.Hanshin;
import company.HongKong;
import company.Paikdabang;
import person.Customer;
import person.Employee;

public class testMain {

	public static void main(String[] args) {
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
		System.out.println("--------------------");
		System.out.println("손님의 이름과 나이를 입력");
		System.out.println("--------------------");
		String name = sc.next();
		int age = sc.nextInt();
		Customer c1 = new Customer(name,age);
		Hanshin h = new Hanshin();
		boolean b = true;
		while(b!=false) {
			System.out.println("--------------------");
			System.out.println("1.매장방문 2.영수증 3.종료");
			System.out.println("--------------------");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("--------------------");
				System.out.println("1.한신포차 2.홍콩반점 3.백다방");
				System.out.println("--------------------");
				int choice1 = sc.nextInt();
				if(choice1 == 1) {
					h.setEmployeeList(EmployeeList);
					h.setCustomerList(customerList);
					System.out.println("--------------------");
					System.out.println("주문하실 직원");
					System.out.println("--------------------");
					for(int i=0; i<h.getEmployeeList().size();i++) {
						System.out.print((i+1)+"."+EmployeeList.get(i).getName()+" ");
					}
					int ec = sc.nextInt();
					Employee e = EmployeeList.get(ec-1);
					System.out.println("--------------------");
					System.out.println("주문하기");
					System.out.println("--------------------");
					boolean menu = true;
					while(menu) {
						h.showMenu();
						int m = sc.nextInt();
						if(m == 3) {
							menu = false;
							break;
						}
						c1.order(e,choice,m);
					}
					System.out.println(h.getSales());	
				}
				break;
			case 2:
				System.out.println("손님 이름을 입력하세요.");
				String s = sc.next();
				if(s.equals(c1.getName())){
					System.out.println("--------------------");
					System.out.println("매장: "+choice);
					System.out.println("가격: "+h.getSales()+"원");
					System.out.println("--------------------");
				}
				break;
			case 3: 
				b = false;
				System.out.println("종료");
				break;
			}
		}
	}
}
