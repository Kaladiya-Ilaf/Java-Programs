import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeWageBuilder implements ComputeWage
{
	private int noOfCompany;
	private List<Company> companyList;
	private Map<String, Company> map;

	public  EmployeeWageBuilder() //creating constructor
	{
        this.companyList = new ArrayList<>();
	    this.map = new HashMap<>();
	}

	@Override
	public void addCompany(final String name, final int empRate, final int totalWorkingDays, final int maxHrsInMonth)
	{
	    final Company company=new Company(name, empRate, totalWorkingDays, maxHrsInMonth);
	    companyList.add(company);
	    map.put(name, company);
	}
	
    @Override
	public void computeEmpWage()
	{
	    companyList.forEach(this::computeEmpWage);
	}

	private void computeEmpWage(final Company company)
	{
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
        company.setTotalEmpWage(totalEmpHrs * company.getEmpRate());
   }
    @Override
    public int getTotalWageByCompanyName(String name) 
    {
        final Company company= map.get(name);
        return company.getTotalEmpWage();
    }


    public static void main(String args[])
    {

      ComputeWage cb =  new EmployeeWageBuilder();
        //For Apple
      cb.addCompany("Apple", 20, 20, 100);
        // For Samsung
      cb.addCompany("Samsung",25, 15, 150);
      cb.computeEmpWage();

      final int appleWage=cb.getTotalWageByCompanyName("Apple");
      System.out.println("Total Employee Wage for Apple :" +appleWage);
    }
	
}

//Interface having unimplemented methods
interface ComputeWage
{
   void addCompany(final String name, final int empRate, final int totalWorkingDays, final int maxHrsInMonth);
   void computeEmpWage();
   int getTotalWageByCompanyName(String name);
 }

//Class company with get and set methods for various properties of company
 class Company
 {
   private String name;
   private int empRate;
   private int totalWorkingDays;
   private int maxHrsInMonth;
   private int totalEmpWage;
   public Company()
   {
   }

   public Company(final String name,final int empRate,final int totalWorkingDays,final int maxHrsInMonth)
     {
        this.name=name;
        this.empRate=empRate;
        this.totalWorkingDays=totalWorkingDays;
        this.maxHrsInMonth=maxHrsInMonth;
     }
  public void setName( final String name)
     {
        this.name=name;
     }
 public String getName()
     {
        return name;
     }
 public void setEmpRate( final int empRate)
     {
        this.empRate=empRate;
     }
 public int getEmpRate()
     {
        return empRate;
     }
  public void setTotalWorkingDays( final int totalWorkingDays)
     {
        this.totalWorkingDays=totalWorkingDays;
     }
  public int getTotalWorkingDays()
  {
     return totalWorkingDays;
  }
public void setMaxHrsInMonth( final int maxHrsInMonth)
  {
     this.totalWorkingDays=totalWorkingDays;
  }
public int getMaxHrsInMonth()
  {
     return maxHrsInMonth;
  }
public void setTotalEmpWage( final int totalEmpWage)
  {
     this.totalEmpWage=totalEmpWage;
  }

public int getTotalEmpWage()
  {
     return totalEmpWage;
  }
@Override  //Using toString method for calculating total Employee Wage for each Company
public String toString(){
      return "Total Employee Wage for Company :" +name+ " is :" +totalEmpWage;
     }


 }
