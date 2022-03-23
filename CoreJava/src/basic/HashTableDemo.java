package basic;

import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
		Hashtable<String, Integer> nameAge = new Hashtable<String, Integer>();
		System.out.println(nameAge.size());
		nameAge.put("AAA", 10);
		nameAge.put("AAb", 20);
		System.out.println(nameAge.toString());
		nameAge.forEach((k,v) -> System.out.println(k.toString()+" - "+v.toString()));
	}

}
