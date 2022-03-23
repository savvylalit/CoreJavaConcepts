package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> values = new ArrayList<Integer>();
		values.add(6);
		values.add(3);
		values.add(5);
		values.add(2, 55); // add element at an index
		
			
		// 1) Iterate with for Loop
		System.out.println("Print with for loop:");
		for(int i=0; i<values.size(); i++)
			System.out.println(values.get(i));
		
		// 2) Iterate with enhanced for loop
		System.out.println("Print with foreach loop:");
		for(int val : values)
			System.out.println(val);
		
		// 3) Iterate with  ListIterator
		System.out.println("Print with ListIterator:");
		ListIterator<Integer> lstItr = values.listIterator();
		while(lstItr.hasNext())
			System.out.println(lstItr.next());
		
		// 4) Iterate with Java 8 Stream API
		System.out.println("Print with Java 8 stream:");
		values.forEach(System.out::println);
		
		System.out.println("Value at in index 3 : " + values.get(3));
		
		System.out.println("List contains value 55 : "+values.contains(55));
		
		System.out.println("Sorted List values:");
		Collections.sort(values);
		values.forEach(val -> System.out.println(val));
		
		System.out.println("Sorted List values in reverse:");
		Collections.reverse(values);
		values.forEach(val -> System.out.println(val));
		
		System.out.println("Size : "+values.size());
	}

}
