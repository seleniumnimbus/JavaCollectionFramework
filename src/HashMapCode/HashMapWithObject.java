package HashMapCode;

import java.util.HashMap;
import java.util.Map;

public class HashMapWithObject {

	public static void main(String[] args) {

		HashMap<Integer,Employee> hmap = new HashMap<Integer,Employee>();

		//Creating object of employee
		Employee emp1 = new Employee("Employee 1",1,"Address 1");
		Employee emp2 = new Employee("Employee 2",2,"Address 2");
		Employee emp3 = new Employee("Employee 3",3,"Address 3");

		//Add employee to hash map
		hmap.put(1, emp1);
		hmap.put(2, emp2);
		hmap.put(3, emp3);

		//Traversing map  
		for(Map.Entry<Integer, Employee> entry : hmap.entrySet()){    
			int key = entry.getKey();  
			Employee emp = entry.getValue();
			System.out.println(key+" Details:");  
			System.out.println(emp.name + " , " + emp.id + " , " + emp.address);   
		}    



	}

}
