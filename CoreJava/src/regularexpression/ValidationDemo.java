package regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationDemo {

	public static void main(String[] args) {
		// Phone Number Validation. 
		// Rules: 
		// > Phone number has to 10 digits. The first digit shall be between 7 to 9.
		// > Phone number can be pre-fixed with either 0 or 91 or 091 or +91
		// > E.g.: 9869555973, 09869555973, 919869555973, 0919869555973, +919869555973
		String phoneRegex = "(0|91|091|\\+91)?[7-9][\\d]{9}";
		//String phoneRegex = "(0|91|091|\\+91)?[7-9][0-9]{9}";
		Pattern phonePattern = Pattern.compile(phoneRegex);
		Matcher phoneMatcher = phonePattern.matcher("+919869555973");	// change this number to test.
		System.out.println(phoneMatcher.matches()? "Valid Phone" : "Invalid Phone");
		
		// Email Validation
		// Rules:
		// > Left side can be alphanumeric with only '.' or '_' special character
		// @ in between is compulsory
		// Right side can be alphanumeric with only '.' allowed. There should be at least 1 '.'
		String emailRegex = "[\\w]+[\\w_.]*@[\\w]+([.][\\w]+)+";
		//String emailRegex = "[a-zA-Z0-9]+[a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z0-9]+)+";
		Pattern emailPattern = Pattern.compile(emailRegex);
		Matcher emailMatcher = emailPattern.matcher("savvy_lal@tv8.co.in");	// Change this semail to test
		System.out.println(emailMatcher.matches()? "Valid Email Id" : "Invalid Email Id");

	}

}
