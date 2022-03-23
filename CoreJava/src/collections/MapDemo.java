package collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) 
	{
		/************HashMap**************/
		System.out.println("******HashMap******");
		Map<String, String> phonebook = new HashMap<String, String>();
		phonebook.put("Savvy", "+123-112456");
		phonebook.put("Sherry", "456-456-456");
		phonebook.put(null, "523-542134"); // one null key allowed in HashMap
		phonebook.put("Savvy", "23234-3453"); // this key's value will be replaced.
		
		// To fetch all values using keys. 
		System.out.println("\nget values with keySet()...");
		for(String key : phonebook.keySet())
			System.out.println(phonebook.get(key));
		
		// To fetch key, value together. We use Map.Entry
		System.out.println("\nget key,values with entrySet()...");
		Set<Map.Entry<String, String>> entry = phonebook.entrySet();
		for(Map.Entry<String, String> e : entry)
			System.out.println("Key : " + e.getKey() + ", Value : " + e.getValue());
		
		/************Hashtable**************/
		System.out.println("\nWith Hashtable...");
		Map<String, String> table = new Hashtable<String, String>();
		table.put("Name", "Savvy");
		table.put("Actor", "Hrithik");
		//table.put(null, "Red"); // not allowed will throw exception in runtime
		table.put("Actor", "Akshay"); // this key's value will be replaced.
		
		for(String key : table.keySet())
			System.out.println(table.get(key));
	}

}
