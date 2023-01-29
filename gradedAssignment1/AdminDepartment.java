package gradedAssignment1;

public class AdminDepartment extends SuperDepartment {
	
	/**
	 * Method Name : departmentName
	 * @return fixed string "Administrative Department".
	 */
	public String departmentName() {
		return "Admin Department";
	}
	
	/**
	 * Method Name : getTodaysWork
	 * @return fixed string "Complete your documents submission.".
	 */
	public String getTodaysWork() {
		return "Complete your documents submission.";
	}
	
	/**
	 * Method Name : getWorkDeadline
	 * @return fixed string "Complete by EOD".
	 */
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
	
}
