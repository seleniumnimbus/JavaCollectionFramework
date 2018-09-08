package HashMapCode;

import java.util.HashMap;
import java.util.Map;

public class BasicHashMap {

	public static void main(String[] args) {

		HashMap<Integer,String> hmap = new HashMap<Integer,String>();

		//put element to hashmap
		hmap.put(1, "String 1");
		hmap.put(2, "String 2");
		hmap.put(3, "String 3");
		hmap.put(4, "String 4");
		hmap.put(5, "String 5");
		
		//Traversing through hashmap
		System.out.println("Traversing through hashmap");
		for(Map.Entry map : hmap.entrySet()){  
			System.out.println(map.getKey()+" , "+map.getValue());  
		}
		
		//Remove data from hashmap
		hmap.remove(2);
		hmap.remove(4, "String 4");
		
		System.out.println("Remove data from hashmap");
		for(Map.Entry map : hmap.entrySet()){  
			System.out.println(map.getKey()+" , "+map.getValue());  
		}


	}

}
