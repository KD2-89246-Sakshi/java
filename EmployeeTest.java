class Employee
{
	private String firstName;
	private String lastName;
	private double monthlySalary;
	
	//constructor 
	public Employee(String firstName, String lastName, double monthlySalary)
	{
		this.firstName= firstName;
		this.lastName=lastName;
		this.monthlySalary=monthlySalary;
	}
	
	//getter setter
	//for firstname
	public String getFirstName()
	{
		return firstName;
	}
	public void setFirstName(String firstName)
	{
		this.firstName= firstName;
	}
	//for last name
	public String getLastName()
	{
		return lastName;
	}
	public void setLastName(String lastName)
	{
		this.lastName=lastName;
	}
	
	//for monthlysalary
	public double getMonthlySalary()
	{
		return monthlySalary;
	}
	public void setMonthlySalary(double monthlySalary)
	{
		if(monthlySalary > 0)
		{
			this.monthlySalary=monthlySalary;
		}
	}
	
	//calculate yearly salary
	public double getYearlySalary()
	{
		return monthlySalary * 12;
	}
	
	//apply 10% raise
	public void Raise()
	{
		this.monthlySalary *=0.1;
	}
}


public class EmployeeTest {

	public static void main(String[] args) {
		Employee e1 = new Employee("Sakshi", "Dake",300.00);
		Employee e2 = new Employee("Yashu", "Patil", 200.00);

		System.out.println("Employee 1: " +e1.getFirstName()+ " " + e1.getLastName());
	    System.out.println("Yearly Salary : " + e1.getYearlySalary());
	    System.out.println("Employee 2: " +e2.getFirstName()+" " + e2.getLastName());
	    System.out.println("Yearly Salary: " + e2.getYearlySalary() );
	    
	    //after 10% rasing the salary
	    System.out.println("Here is the raise in the salary of Employess \n");
	    
	    e1.Raise();
	    System.out.println("Employee 1: " +e1.getFirstName()+ " " + e1.getLastName());
	    System.out.println("Yearly Salary : " + e1.getYearlySalary());
	    System.out.println("Employee 2: "+e2.getFirstName() + " "+e2.getLastName());
	    System.out.println("Yearly Salary :" +e2.getYearlySalary());
	    
	   
	}

}
