package labsession1.app;

import java.util.Scanner;
import labsession1.service.Credential;
import labsession1.project.Employee;

public class DriverClass {
	
	public static void main( String args[] ) {
		
		String[] department      =  new String[] {"Technical", "Admin", "Human Resource", "Legal"};
		int userInput			 =  displayOptions();
		while( userInput <= 0 || userInput > 4 ) {
			System.out.println("Oops !! You have selected wrong option.\r\n");
			userInput			 =  displayOptions();
		}
		int departmentIdx		=	userInput - 1 ;
		String departmentName   =	department[departmentIdx];
		System.out.println("Department selected by you is "+departmentName);
		
		Employee employeeObj	=	new Employee( "Gautam", "Gupta");
		employeeObj.setDepartment(departmentName);
		employeeObj.setCompanyName("gl.com");
		
		Credential credentialObj	=	new Credential(employeeObj);
		credentialObj.generateEmailAddress();
		credentialObj.generatePassword();
		credentialObj.showCredentials();
		
	}
	
	public static int displayOptions() {
		Scanner sc 	= 	new Scanner( System.in );
		System.out.println("Please enter the department of employee \r\n"
				+ "1. Technical \r\n"
				+ "2. Admin \r\n"
				+ "3. Human Resource \r\n"
				+ "4. Legal\r\n");
		int input 	= 	sc.nextInt();
		return input;
	}
}
