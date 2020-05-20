package phone;

import java.util.ArrayList;

public interface Interface {
	void addPerson(Person person);
	ArrayList<Person> searchPerson(String name);
	String deletePerson(String phone);
	void countName();
}
