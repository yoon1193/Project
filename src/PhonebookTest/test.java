package PhonebookTest;

import phone.PhoneBookShow;

public class test {

	public static void main(String[] args) {
		PhoneBookShow pbs = new PhoneBookShow();
		boolean b = true;
		while(b) {
			int num = Integer.parseInt(pbs.choice());
			if(num  == 1){
				pbs.input();
				}
			else if(num  == 2){
				pbs.search();
				}
			else if(num  == 3){
	            pbs.delete();
	            }
			else if(num  == 4){
	            pbs.show();
	            }
			else if(num  == 5){
				b = false;
				System.out.println("Á¾·á.");
			}	
		}
	}
}