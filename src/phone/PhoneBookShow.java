package phone;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class PhoneBookShow {
	Scanner sc = new Scanner(System.in);
	PhoneBook pb = new PhoneBook();
	ArrayList<Person> personList = new ArrayList<Person>(); 
	
	public String choice(){
        System.out.println("--------------------��ȭ��ȣ��--------------------");  
        System.out.println("1.�űԵ��  __ 2.ã��  __ 3.����  __ 4.��ȭ��ȣ��  __ 5.����" );
        System.out.println("------------------------------------------------");
        String selectNum = sc.nextLine();
        return selectNum;
    }

    public void input(){
        System.out.println("�̸� �Է�>>");
        String name = sc.nextLine();
        System.out.println("��ȭ��ȣ �Է�>>");
        String phoneNumber = sc.nextLine();
        Person person = new Person(name,phoneNumber);
        pb.addPerson(person);
    }

    public void search(){
        System.out.println("ã�� �̸��� �Է�");
        String name = sc.nextLine();
        personList = pb.searchPerson(name);
        showName(personList);
    }

    public void showName(ArrayList<Person> personList){
    	System.out.println("------------------------------------------------");
        System.out.println("�̸�       ��ȭ��ȣ");
        for(Person person: personList){
            System.out.println(person.getName()+"    "+person.getPhoneNumber());;
            
        }
    }
    public void show() {
    	System.out.println("---------��ȭ��ȣ��---------");
    	pb.countName();
    }

    public void delete(){
        System.out.println("������ ����� �̸��� �Է��ϼ���");
        String name = sc.nextLine();
        String delete = pb.deletePerson(name);
    }

}
