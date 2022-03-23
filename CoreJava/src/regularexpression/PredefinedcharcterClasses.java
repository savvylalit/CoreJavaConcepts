package regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* Below are the character classes synbols:
 * \s	: Space " " character
 * \S	: except Space " " character
 * \d	: any digit from 0 to 9
 * \D	: except digit, any character
 * \w	: any word character i.e. alphanumeric
 * \W	: except word character i.e. Special character
 * .	: any character
 * */
 
public class PredefinedcharcterClasses {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("a");
		Matcher m = p.matcher("abaabaaab");
		int count = 0;

		while(m.find()) {
			System.out.println(m.start()+"..."+m.group());
			count++;
		}
		System.out.println("The total number of mathches are " + count);

	}

}
