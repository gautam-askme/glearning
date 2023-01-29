package labsession1.service;
import labsession1.project.Employee;
import java.util.Random;
import java.util.Arrays;

public class Credential {
	public Employee employee;
	public Credential(Employee employee) {
		 this.employee = employee;
	}
	
	public void generateEmailAddress() {
		employee.emailAddress = employee.getEmployeeName()+'@'+employee.getDepartment()+"."+employee.getCompanyName();
		employee.emailAddress = employee.emailAddress.toLowerCase();
	}
	
	public void generatePassword() {
		String number 		= 	"0123456789";
		String capital		=	"ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower	  	=	"abcdefghijklmnopqrstuvwxyz";
		String special    	=   "!@#$%^&*";
		char[] password 	=   new char[8];
		int index;
		Random rnd 			= 	new Random();
		index 				=   rnd.nextInt(special.length());
		password[0]			=	special.charAt(index);
		password[1]			=	lower.charAt(rnd.nextInt(lower.length()));
		password[2]			=	lower.charAt(rnd.nextInt(lower.length()));
		password[3]			=	lower.charAt(rnd.nextInt(lower.length()));
		password[4]			=	number.charAt(rnd.nextInt(number.length()));
		password[5]			=	number.charAt(rnd.nextInt(number.length()));
		password[6]			=	capital.charAt(rnd.nextInt(capital.length()));
		password[7]			=	capital.charAt(rnd.nextInt(capital.length()));
		for (int i = 0; i < password.length; i++) {
			int swapIndex = rnd.nextInt(password.length);
			char temp 	  = password[swapIndex];
			password[swapIndex] = password[i];
			password[i]   = temp;
		}
		employee.password = employee.password.valueOf(password);
		
	}
	
	public void showCredentials() {
		
		System.out.println("Email --->"+employee.emailAddress);
		System.out.println("Password --->"+employee.password);
	}
	
	
}
