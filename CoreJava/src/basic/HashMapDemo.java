package basic;

import java.util.HashMap;
/*Find the first redundant character in the given string*/
public class HashMapDemo {
	public static void main(String[] args) {
		
		String str = "BCADBA";
		System.out.println(HashMapDemo.getRepeatChar(str));
	}
	
	public static String getRepeatChar(String str){
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i=0; i<str.length(); i++) {
			char a = str.charAt(i);
			if(map.get(a)==null)
				map.put(a, 1);
			else
				return String.valueOf(a);
		}
		return "No repetation in the string";
	}

}
