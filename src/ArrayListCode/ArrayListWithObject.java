package ArrayListCode;

import java.util.ArrayList;

public class ArrayListWithObject {

	public static void main(String[] args) {
		
		ArrayList<Employee> emp = new ArrayList<Employee>();
		
		//Creating object of employee
		Employee emp1 = new Employee("Employee 1",1,"Address 1");
		Employee emp2 = new Employee("Employee 2",2,"Address 2");
		Employee emp3 = new Employee("Employee 3",3,"Address 3");
		
		//Adding employee to array list 
		emp.add(emp1);
		emp.add(emp2);
		emp.add(emp3);
		
		//Traversing array list  
	    for(Employee e : emp){  
	        System.out.println("Emp Name : " + e.name + ", Emp ID : " + e.id + " Emp Address : " + e.address);  
	    }  
		

	}

}
