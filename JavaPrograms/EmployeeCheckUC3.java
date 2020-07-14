/**
 * The Employee check class
 */

public class EmployeeCheckUC3 {

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
		
		final double attendanceValue = Math.floor(Math.random() * 10) % 3;
		if (IS_PART_TIME == attendanceValue) {
			System.out.println("Employee is Part Time");
		  	return (4);
		  }
		else if(IS_FULL_TIME == attendanceValue){
			System.out.println("Employee is Full Time");
			return (8);
		}  
		else{
			System.out.println("Employee is Absent");
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

    