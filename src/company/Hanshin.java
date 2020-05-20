package company;

import java.util.ArrayList;

import Order.order;
import person.Customer;
import person.Employee;

public class Hanshin implements Theborn {
	
	private ArrayList<Employee> EmployeeList = new ArrayList<Employee>();
	private ArrayList<Customer> customerList = new ArrayList<Customer>();
	public static order[] hanshinMenu = {new order("¥ﬂπﬂ",12000),new order("≈Î¥ﬂ",10000),new order("¡æ∑·",0)};
	
	public void showMenu() {
		for(int i=0;i<hanshinMenu.length;i++) {
			System.out.print((i+1)+"."+hanshinMenu[i].menu+" "+hanshinMenu[i].price+", ");
		}
	}
	public ArrayList<Employee> getEmployeeList(){
		return EmployeeList;
	}
	public void setEmployeeList(ArrayList<Employee> EmployeeList) {
		this.EmployeeList = EmployeeList;
	}
	public ArrayList<Customer> getCustomerList(){
		return customerList;
	}
	public void setCustomerList(ArrayList<Customer> customerList) {
		this.customerList = customerList;
	}

	@Override
	public int getSales() {
		int priceAll=0;
		for(int i=0; i<EmployeeList.size();i++) {
			Employee e = EmployeeList.get(i);
			ArrayList<order> orderList = e.orderList;
			for(int j=0;j<orderList.size();j++) {
				priceAll+=orderList.get(j).price;
				
			}
			
		}
		return priceAll;
	}
	@Override
	public int sell() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
