package phone;

import java.util.ArrayList;
import java.util.Iterator;

public class PhoneBook implements Interface {
	public ArrayList<Person> personList;
	
	public PhoneBook() {
		personList = new ArrayList<Person>();
	}

	@Override
	public void addPerson(Person person) {
		personList.add(person);
	}

	@Override
	public ArrayList<Person> searchPerson(String name) {
		ArrayList<Person> searchList = new ArrayList<Person>();
        for(Person person : personList){
            if(person.getName().equals(name)){
                searchList.add(person);
            }
        }
        return searchList;
	}

	@Override
	public String deletePerson(String name) {
		int deleteCount = 0;
		Iterator<Person> iterator = personList.iterator();
		while(iterator.hasNext()){
			Person person = iterator.next();
			if(person.getName().equals(name)){
				iterator.remove();
				System.out.println(name+"을/를 삭제했습니다.");
				}
			else {
				System.out.println("등록된 이름이 없습니다.");
			}
		}
		return name;
		
		
	}
	@Override
	public void countName() {
		if(!personList.isEmpty()) {
			for(Person p:personList) {
				System.out.println(p);
			}
		}
		else {
			System.out.println("등록된 번호가 없습니다. 등록하세요.");
		}
	}

}
