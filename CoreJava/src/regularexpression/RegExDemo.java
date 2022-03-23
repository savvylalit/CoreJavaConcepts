package regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("ab");
		Matcher m = p.matcher("abbabbba");
		int count = 0;

		while(m.find()) {
			System.out.println(m.start()+"..."+m.end()+"..."+m.group());
			count++;
		}
		System.out.println("The total number of mathches are " + count);
	}

}
