package odd;

import java.io.*;
import java.util.ArrayList; 

public class Company_Runner
{
	
	public static void main(String[] args)
	
	{
		// 1. Set yourself as the owner, make your salary 200,000  
		
		Manager owner = new Manager("Lakshmi", 0, 200000);
	
	
		// 2. The owner decided he needed to hire 5 employees each for annual salary of $80k. All hires are the owner's subordinates.
		
		
		Employee emp1 = new Employee("John", 1, 80000);
		Employee emp2 = new Employee("Josh", 2 , 80000);
		Employee emp3 = new Employee("Jones", 3 , 80000);
		Employee emp4 = new Employee("Jay", 4 , 80000);
		Employee emp5 = new Employee("Jack", 5 , 80000);
		
		owner.addEmployee(emp1);
		owner.addEmployee(emp2);
		owner.addEmployee(emp3);
		owner.addEmployee(emp4);
		owner.addEmployee(emp5);
		
		// 3. They all compete for one managerial position that manages the other 4 employees. (Make whoever you want the manager)  
		
		Manager m1 = owner.makeManager(emp3, 100000);
		
		(m1).addEmployee(emp1);
		(m1).addEmployee(emp2);
		(m1).addEmployee(emp4);
		(m1).addEmployee(emp5);
		
		// 4. The owner says that he wants to hire 5 new employees and wants 1 more manager from the 4 subordinates of the first manager.
		
		Employee emp6 = new Employee("Bill", 1, 80000);
		Employee emp7 = new Employee("Ben", 2 , 80000);
		Employee emp8 = new Employee("Baker", 3 , 80000);
		Employee emp9 = new Employee("Bob", 4 , 80000);
		Employee emp10 = new Employee("Bee", 5 , 80000);
		
		Manager m2= owner.makeManager(emp4, 100000);
		(m2).addEmployee(emp6);
		(m2).addEmployee(emp7);
		(m2).addEmployee(emp8);
		(m2).addEmployee(emp9);
		(m2).addEmployee(emp10);
		
		
		
		

		

	}

}