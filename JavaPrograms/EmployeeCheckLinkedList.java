import java.util.LinkedList;
/**
 * The Employee check class
 */

public class EmployeeCheckLinkedList {
	private int numOfCompany = 0;
	private LinkedList<Company> companyEmpWageList;
	
	public EmployeeCheckLinkedList() {
		companyEmpWageList = new LinkedList<>();
	}

	private void addCpompnyEmployWage(final String companyName, final int companyWage, final int workingDays,
			final int workingHours) {
		Company companyEmpWage = new Company(companyName, companyWage, workingDays, workingHours);
		companyEmpWageList.add(companyEmpWage); 
	}

    
    /**
     * Check employee
     * @return true if employee present otherwise false.
     */
    private static int computeEmpWage(final Company company){
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
		return totalEmpHrs * company.getEmpRate();
		
	}
  	private void computeEmpWage() {
		for (int i = 0; i < companyEmpWageList.size(); i++) {
			Company companyEmpWage = companyEmpWageList.get(i);
			companyEmpWage.setTotalEmpWage(this.computeEmpWage(companyEmpWage));
			System.out.println(companyEmpWageList);
		}
	}
	public static void main(String[] args) {

		final EmployeeCheckLinkedList companyWage = new EmployeeCheckLinkedList();
		// For Apple
		companyWage.addCpompnyEmployWage("Apple", 20, 20, 100);
		// For Samsung
		companyWage.addCpompnyEmployWage("samsung", 22, 30, 120);

		companyWage.computeEmpWage();

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
		return "Total Employ wage for the company " + name + " is " + totalEmpWage+"\n";
	}
}
