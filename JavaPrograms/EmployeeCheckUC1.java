/**
 * Employee checks class
 */
public class EmployeeCheckUC1{
	
	private static final int IS_PRESENT = 1;  
	
	public static void main(String[] args) {
		employeeAttendance(); 
	}
	
	/**
	 * In function 'employeeAttendance()' it is checked whether employee is present or absent.
	 */
	public static void employeeAttendance(){
		final double randomValue = Math.floor(Math.random()*10)%2;
		if(IS_PRESENT == randomValue){
			System.out.println("Employee is PRESENT");
		}
		else{
			System.out.println("Employee is ABSENT");
		}	
	}
}
