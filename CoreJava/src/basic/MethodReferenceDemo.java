package basic;

import java.util.Arrays;
import java.util.List;

interface Parser{
	String parse(String str);
}

class StringParser{
	public static String convert(String s) {
		if(s.length()<=3)
			s = s.toUpperCase();
		else
			s = s.toLowerCase();
		
		return s;
	}
	
	public String convertNonStatic(String s) {
		if(s.length()<=3)
			s = s.toUpperCase();
		else
			s = s.toLowerCase();
		
		return s;
	}
}

class MyPrinter{
	public void print(String str, Parser p) {
		str = p.parse(str);
		System.out.println(str);
	}
}

// Method Reference allows for Call by method. We are passing method as parameter
public class MethodReferenceDemo {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Savvy1","Savvy2","Savvy3","Savvy4");
		
		names.forEach(System.out::println);
		
		MyPrinter mp = new MyPrinter();
		
		mp.print("Savvy static", StringParser::convert); // Calling static method so using class name.
		
		StringParser sp = new StringParser();
		mp.print("Savvy non static", sp::convertNonStatic); // Calling non-static method, so need instance variable.
		
	}

}

/*
-	Method reference helps to point to method by their names.
-	A method reference is described using ‘::’ symbol.
-	The method reference can be used to point following type of methods:
	o	Static methods
	o	Instance methods
	o	Constructors using  new operator
*/
