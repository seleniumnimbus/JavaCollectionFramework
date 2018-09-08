package ArrayListCode;

import java.util.ArrayList;
import java.util.Iterator;

public class BasicArrayList {

	public static void main(String[] args) {

		ArrayList<String> alist = new ArrayList<String>();

		//Add element to the ArrayList
		alist.add("String 1");
		alist.add("String 2");
		alist.add("String 3");
		alist.add("String 4");
		alist.add("String 5");

		//Traversing elements of ArrayList using for loop
		System.out.println("Traversing elements of ArrayList using for loop");
		for(String al : alist){
			System.out.println(al);
		}

		//Traversing elements of ArrayList using while loop
		System.out.println("Traversing elements of ArrayList using while loop");
		Iterator itr=alist.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//Remove element from ArrayList
		alist.remove(2);
		System.out.println("Remove element from ArrayList");
		for(String al : alist){
			System.out.println(al);
		}
		
		
		//AddAll method
		ArrayList<String> alist2 = new ArrayList<String>();

		alist2.add("String 6");
		alist2.add("String 7");
		alist2.add("String 8");
		alist2.add("String 9");
		alist2.add("String 10");
		
		alist2.addAll(alist);
		System.out.println("AddAll ArrayList 2 With ArrayList 1");
		for(String al : alist2){
			System.out.println(al);
		}
		
		//Retain All
		ArrayList<String> alist3 = new ArrayList<String>();

		alist3.add("String 3");
		alist3.add("String 4");
		alist3.add("String 5");
		alist3.add("String 6");
		alist3.add("String 7");
		
		alist3.retainAll(alist);
		System.out.println("Retain All Arraylist 1 element to arraylist 3");
		for(String al : alist3){
			System.out.println(al);
		}
		
		//Remove All
		ArrayList<String> alist4 = new ArrayList<String>();

		alist4.add("String 3");
		alist4.add("String 4");
		alist4.add("String 5");
		alist4.add("String 6");
		alist4.add("String 7");
		
		alist4.removeAll(alist);
		System.out.println("Remove All Arraylist 1 element from arraylist 4");
		for(String al : alist4){
			System.out.println(al);
		}
		
		




	}

}
