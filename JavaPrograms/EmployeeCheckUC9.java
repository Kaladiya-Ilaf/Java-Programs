

/**
 * The Employee check class
 */

public class EmployeeCheckUC9 {

    public static void main(String[] args) {


        //For Apple
		final Company apple = new Company("Apple", 20, 20, 100);
		System.out.println("Employee for -> "+apple.getName());
		computeEmpWage(apple);
		System.out.println(apple);

		//For Samsung
		final Company samsung = new Company("Samsung", 22, 30, 120);
		System.out.println("Employee for -> "+samsung.getName());
		computeEmpWage(samsung);
		System.out.println(samsung);
		   
        //For Huawei
		final Company huawei = new Company("Huawei", 22, 25, 120);
		System.out.println("Employee for -> "+huawei.getName());
		computeEmpWage(huawei);
		System.out.println(huawei);
		       
    }
    
    /**
     * Check employee
     * @return true if employee present otherwise false.
     */
    public static void computeEmpWage(final Company company){
		//variables
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;

		while(totalEmpHrs <= company.getMaxHrsInMonth() && totalWorkingDays < company.getTotalWorkingDays()) {
			
			final int value = (int) Math.floor(Math.random() * 10) % 3;
			switch(value) {
				case 1:
					empHrs = 4;
					break;
				case 2:
					empHrs = 8;
					break;
				default: 
					empHrs = 0;
					break;
			}
			totalWorkingDays++;
			totalEmpHrs+=empHrs;
			System.out.println("Day "+totalWorkingDays+"\t Employee Hrs: "+  empHrs);

          
		}
		int totalWage = totalEmpHrs * company.getEmpRate();
		company.setTotalEmpWage(totalWage);
	}
  
    
}

//Class company with get and set methods for various properties of company


class Company {

	private String name;

	private int empRate;

	private int totalWorkingDays;

	private int maxHrsInMonth;

	private int totalEmpWage;

	//Compulsory Constructor without parameter
	public Company(){
	}

	//Compulsary with all required parameter
	public Company(final String name, final int empRate, final int totalWorkingDays, final int maxHrsInMonth){
		this.name = name;
		this.empRate = empRate;
		this.totalWorkingDays =totalWorkingDays;
		this.maxHrsInMonth = maxHrsInMonth;
	}	

	public void setName(final String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}

	public void setEmpRate(final int empRate){
		this.empRate = empRate;
	}
	public int getEmpRate(){
		return empRate;
	}

	public void setTotalWorkingDays(final int totalWorkingDays){
		this.totalWorkingDays = totalWorkingDays;
	}
	public int getTotalWorkingDays(){
		return totalWorkingDays;
	}

	public void setMaxHrsInMonth(final int maxHrsInMonth){
		this.maxHrsInMonth = maxHrsInMonth;
	}
	public int getMaxHrsInMonth(){
		return maxHrsInMonth;
	}

	public void setTotalEmpWage(final int totalEmpWage) {
		this.totalEmpWage = totalEmpWage;
	}
	public int geTotalEmpWage(){
		return totalEmpWage;
	}

	@Override
	public String toString() {
		return "Total Employ wage for the company " + name + " is " + totalEmpWage;
	}
}
