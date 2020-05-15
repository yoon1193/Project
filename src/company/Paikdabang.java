package company;

import java.util.ArrayList;

import person.Customer;
import person.Empolyee;

public class Paikdabang implements Theborn {
	private ArrayList<Empolyee> empolyeeList = new ArrayList<Empolyee>();
	private ArrayList<Customer> customerList = new ArrayList<Customer>();
	
	public ArrayList<Empolyee> getEmpolyeeList(){
		return empolyeeList;
	}
	public void setEmpolyeeList(ArrayList<Empolyee> empolyeeList) {
		this.empolyeeList = empolyeeList;
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
	public void reservation() {
		// TODO Auto-generated method stub
		
	}

}
