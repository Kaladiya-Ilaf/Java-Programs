/**
 * The Employee check class
 */

public class EmployeeCheckUC4 {

    private static final int IS_PART_TIME=1;
    private static final int IS_FULL_TIME=2;
	
	
	public static void main(String [] args){

		double wage;
		
		// Calling function
		final int attendance = employeeAttendance();
	
		wage = calulateWage(20, attendance);
		
		
		System.out.println("Total Employee wage is :"+ wage);
	}
	
	/**
	 * Check employee
	 * @return true if employee present otherwise false.
	 */
	public static int employeeAttendance(){
		
		final int attendanceValue = (int) Math.floor(Math.random() * 10) % 3;
		switch(attendanceValue){
			case IS_PART_TIME:
			System.out.println("Employee is Part Time");
		  	return (4);
		  
		  	case IS_FULL_TIME:
		  	System.out.println("Employee is Full time");
		  	return (8);
		  	
		  	default:
		  	System.out.println("Employee is Absent.");
		  	return (0);
		}
	}

	/**
	 * Calculate employee wage based on params.
	 * @param ratePerHrs the employee rate per hours.
	 * @param totalHrs total employee hours.
	 * @return total employee wage.
	 */
	 public static double calulateWage(final int ratePerHrs, final int totalHrs){
		return ratePerHrs*totalHrs;
	} 
    
}

    