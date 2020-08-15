package odd;

public class Employee {
	static int employee_count;
	String ename; 
	int ID;
	private double salary;
	 String name;
	
	public Employee() 
	{
		employee_count++;
		this.ename = "l";
		this.salary= 70000;
		
	}
	
	public Employee(String name) 
	{
		employee_count++;
		this.ename = name;
		salary= 70000;
		
	}
	public Employee(String name, int ID, double salary) 
	{
		this.ID = ID;
		this.ename = name;
		this.salary = salary;
		
		
	}
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	public double getSalary() 
	{
		return salary; 
	}
	public String getSubordinates() 
	{
		return null; 
	}

}