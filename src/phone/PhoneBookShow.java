package phone;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class PhoneBookShow {
	Scanner sc = new Scanner(System.in);
	PhoneBook pb = new PhoneBook();
	ArrayList<Person> personList = new ArrayList<Person>(); 
	
	public String choice(){
        System.out.println("--------------------전화번호부--------------------");  
        System.out.println("1.신규등록  __ 2.찾기  __ 3.삭제  __ 4.전화번호부  __ 5.종료" );
        System.out.println("------------------------------------------------");
        String selectNum = sc.nextLine();
        return selectNum;
    }

    public void input(){
        System.out.println("이름 입력>>");
        String name = sc.nextLine();
        System.out.println("전화번호 입력>>");
        String phoneNumber = sc.nextLine();
        Person person = new Person(name,phoneNumber);
        pb.addPerson(person);
    }

    public void search(){
        System.out.println("찾을 이름을 입력");
        String name = sc.nextLine();
        personList = pb.searchPerson(name);
        showName(personList);
    }

    public void showName(ArrayList<Person> personList){
    	System.out.println("------------------------------------------------");
        System.out.println("이름       전화번호");
        for(Person person: personList){
            System.out.println(person.getName()+"    "+person.getPhoneNumber());;
            
        }
    }
    public void show() {
    	System.out.println("---------전화번호부---------");
    	pb.countName();
    }

    public void delete(){
        System.out.println("삭제할 사람의 이름을 입력하세요");
        String name = sc.nextLine();
        String delete = pb.deletePerson(name);
    }

}
