package gradedAssignment1;

public class HrDepartment extends SuperDepartment {
	
	/**
	 * Method Name : departmentName
	 * @return fixed string "HR Department".
	 */
	public String departmentName() {
		return "HR Department";
	}
	
	/**
	 * Method Name : getTodaysWork
	 * @return fixed string "Fill today's work-sheet and mark your attendance.".
	 */
	public String getTodaysWork() {
		return "Fill today's work-sheet and mark your attendance.";
	}
	
	/**
	 * Method Name : getWorkDeadline
	 * @return fixed string "Complete by EOD".
	 */
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
	
	/**
	 * Method Name: doActivity
	 * @return fixed string "Team Lunch"
	 */
	public String doActivity() {
		return "Team Lunch";
	}
	
}
