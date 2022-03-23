package regularexpression;

import java.util.regex.Pattern;
/*
 * Split method is used to split the target string according to a particular pattern.
 */
public class SplitDemo {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("a");
		String[] S = p.split("Sarvesh is great");
		
		for(String s:S)
			System.out.println(s);

	}

}
