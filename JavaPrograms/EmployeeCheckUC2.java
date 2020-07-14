/**
 * Employee check class
 */
public class EmployeeCheckUC2 
{
	private static final int IS_PRESENT=1;
	
	public static void main(String [] args){
		double wage;
		
		final boolean attendance = employeeAttendance();  // Calling function to check employee
		
		if(attendance){
			wage = calulateWage(20, 8);
			System.out.println("Employee is PRESENT");
		}
		else{
			wage = calulateWage(20, 0);
			System.out.println("Employee is ABSENT");
		}

		System.out.println("Total Employee wage is : "+ wage);
	}
	
	/**
	 * Check employee
	 * @return true if employee present otherwise false.
	 */
	public static boolean employeeAttendance(){
		
		return IS_PRESENT == Math.floor(Math.random() * 10) % 2;
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
