package company;

import java.util.ArrayList;

import Order.order;
import person.Customer;
import person.Employee;

public class Paikdabang implements Theborn {
	private ArrayList<Employee> EmployeeList = new ArrayList<Employee>();
	private ArrayList<Customer> customerList = new ArrayList<Customer>();
	
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
	public void sell() {
		// TODO Auto-generated method stub

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
	

}
