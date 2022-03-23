package regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* Below are the quantifiers symbols:
 * 
 */
public class Quantifiers {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("[0-9a-zA-Z]");
		Matcher m = p.matcher("a7b k@9z");
		int count = 0;

		while(m.find()) {
			System.out.println(m.start()+"..."+m.group());
			count++;
		}
		System.out.println("The total number of mathches are " + count);

	}

}
