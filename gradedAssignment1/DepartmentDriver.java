package gradedAssignment1;

public class DepartmentDriver {
	
	public static void main( String args[]) {
		
		String departmentName;
		String workDetail;
		String deadline;
		String holiday;
		String actDetail;
		String techStack;
		
		/**
		 * Created Object of Admin Department Class
		 * Calling its method of departmentName, getTodaysWork, getWorkDeadline, isTodayAHoliday
		 * Captured Returned values in 4 local String Variables and displayed it. 
		 */
		
		
		AdminDepartment adminObj 	=	new AdminDepartment();
		departmentName 	 			=	adminObj.departmentName();
		workDetail		 			=	adminObj.getTodaysWork();
		deadline  		 			=	adminObj.getWorkDeadline();
		holiday						=	adminObj.isTodayAHoliday();
		
		System.out.println(
				    "Welcome to "+departmentName+"\r\n"
					+workDetail+"\r\n"
					+deadline+"\r\n"
					+holiday+"\r\n\r\n"
				);
		
		/**
		 * Created Object of HR Department Class
		 * Calling its method of departmentName, getTodaysWork, doActivity, getWorkDeadline, isTodayAHoliday
		 * Captured Returned values in 5 local String Variables and displayed it. 
		 */
		
		HrDepartment hrObj 			=	new HrDepartment();
		departmentName 	 			=	hrObj.departmentName();
		actDetail					=	hrObj.doActivity();
		workDetail		 			=	hrObj.getTodaysWork();
		deadline  		 			=	hrObj.getWorkDeadline();
		holiday						=	hrObj.isTodayAHoliday();
		
		System.out.println(
				    "Welcome to "+departmentName+"\r\n"
					+actDetail+"\r\n"
					+workDetail+"\r\n"
					+deadline+"\r\n"
					+holiday+"\r\n\r\n"
				);
		
		
		/**
		 * Created Object of Technology Department Class
		 * Calling its method of departmentName, getTodaysWork, doActivity, getWorkDeadline, isTodayAHoliday
		 * Captured Returned values in 5 local String Variables and displayed it. 
		 */
		
		TechDepartment techObj 		=	new TechDepartment();
		departmentName 	 			=	techObj.departmentName();
		techStack					=	techObj.getTechStackInformation();
		workDetail		 			=	techObj.getTodaysWork();
		deadline  		 			=	techObj.getWorkDeadline();
		holiday						=	techObj.isTodayAHoliday();
		
		System.out.println(
					"Welcome to "+departmentName+"\r\n"
					+workDetail+"\r\n"
					+deadline+"\r\n"
					+techStack+"\r\n"
					+holiday+"\r\n\r\n"
				);

	}
}
