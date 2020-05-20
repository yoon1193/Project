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
		EmployeeList.add(new Employee(20,"���ѽ�"));
		EmployeeList.add(new Employee(21,"���ѽ�"));
		EmployeeList.add(new Employee(22,"���ѽ�"));
		ArrayList<Employee> EmployeeList1 = new ArrayList<Employee>();
		EmployeeList1.add(new Employee(20,"��ȫ��"));
		EmployeeList1.add(new Employee(21,"��ȫ��"));
		EmployeeList1.add(new Employee(22,"��ȫ��"));
		ArrayList<Employee> EmployeeList2 = new ArrayList<Employee>();
		EmployeeList2.add(new Employee(20,"��ٹ�"));
		EmployeeList2.add(new Employee(21,"��ٹ�"));
		EmployeeList2.add(new Employee(22,"���ٹ�"));
		ArrayList<Customer> customerList = new ArrayList<Customer>();

		
		System.out.println("�մ��� �̸��� ���̸� �Է�");
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
			System.out.println("�ֹ��Ͻ� ����");
			for(int i=0; i<h.getEmployeeList().size();i++) {
				System.out.println((i+1)+". "+EmployeeList.get(i).getName());
			}
			int t = sc.nextInt();
			System.out.println("�ֹ��ϱ�");
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
			System.out.println("�ֹ��Ͻ� ����");
			for(int i=0; i<hk.getEmployeeList().size();i++) {
				System.out.println((i+1)+". "+EmployeeList1.get(i).getName());
			}
			int t = sc.nextInt();
			System.out.println("�ֹ��ϱ�");
			hk.showMenu();
			System.out.println("3. �ֹ���");
			int m = sc.nextInt();
			Employee e = EmployeeList1.get(t-1);
			c1.order(e,n,m);
			System.out.println(e.orderList.get(0).menu+" "+hk.getSales());
		}
		else{
			Paikdabang pd = new Paikdabang();
			pd.setEmployeeList(EmployeeList2);
			pd.setCustomerList(customerList);
			System.out.println("�ֹ��Ͻ� ����");
			for(int i=0; i<pd.getEmployeeList().size();i++) {
				System.out.println((i+1)+". "+EmployeeList2.get(i).getName());
			}
			int t = sc.nextInt();
			System.out.println("�ֹ��ϱ�");
			pd.showMenu();
			int m = sc.nextInt();
			Employee e = EmployeeList2.get(t-1);
			c1.order(e,n,m);
			System.out.println(e.orderList.get(0).menu+" "+pd.getSales());

		}
	}
}
