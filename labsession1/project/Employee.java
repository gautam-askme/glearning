package labsession1.project;

public class Employee {
	private String firstName;
	private String lastName;
	private String department;
	public String emailAddress;
	public String password;
	private String companyName;
	
	public Employee( String fname, String lname ){
		this.firstName = fname;
		this.lastName  = lname;
	}
	
	public void setDepartment( String dept ) {
		this.department = dept.replace(" ", "");
	}
	
	public void setCompanyName( String comp ) {
		this.companyName	=	comp;
	}
	
	public String getEmployeeName() {
		String name = this.firstName+this.lastName;
		return name.toLowerCase();
	}
	
	public String getDepartment( ) {
		return this.department.toLowerCase();
	}
	
	public String getCompanyName( ) {
		return this.companyName.toLowerCase();
	}
}

