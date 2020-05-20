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
		System.out.println("--------------------");
		System.out.println("�մ��� �̸��� ���̸� �Է�");
		System.out.println("--------------------");
		String name = sc.next();
		int age = sc.nextInt();
		Customer c1 = new Customer(name,age);
		Hanshin h = new Hanshin();
		boolean b = true;
		while(b!=false) {
			System.out.println("--------------------");
			System.out.println("1.����湮 2.������ 3.����");
			System.out.println("--------------------");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("--------------------");
				System.out.println("1.�ѽ����� 2.ȫ����� 3.��ٹ�");
				System.out.println("--------------------");
				int choice1 = sc.nextInt();
				if(choice1 == 1) {
					h.setEmployeeList(EmployeeList);
					h.setCustomerList(customerList);
					System.out.println("--------------------");
					System.out.println("�ֹ��Ͻ� ����");
					System.out.println("--------------------");
					for(int i=0; i<h.getEmployeeList().size();i++) {
						System.out.print((i+1)+"."+EmployeeList.get(i).getName()+" ");
					}
					int ec = sc.nextInt();
					Employee e = EmployeeList.get(ec-1);
					System.out.println("--------------------");
					System.out.println("�ֹ��ϱ�");
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
				System.out.println("�մ� �̸��� �Է��ϼ���.");
				String s = sc.next();
				if(s.equals(c1.getName())){
					System.out.println("--------------------");
					System.out.println("����: "+choice);
					System.out.println("����: "+h.getSales()+"��");
					System.out.println("--------------------");
				}
				break;
			case 3: 
				b = false;
				System.out.println("����");
				break;
			}
		}
	}
}
