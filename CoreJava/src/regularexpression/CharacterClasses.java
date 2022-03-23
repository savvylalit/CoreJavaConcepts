package regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* Below are the character classes synbols:
 * [abc]	: either 'a' or 'b' or 'c'
 * [^abc]	: except 'a' or 'b' or 'c'
 * [a-z]	: any lowercase alphabet symbol between a-z
 * [A-Z]	: any uppercase alphabet symbol between A-Z
 * [a-zA-Z]	: any lowercase/uppercase alphabet symbol between A-Z
 * [0-9]	: any digit from 0-9
 * [0-9a-zA-Z]: any alphanumeric symbol
 * [^0-9a-zA-Z]: except alphanumeric symbol
 * */
public class CharacterClasses {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("[0-9a-zA-Z]");
		Matcher m = p.matcher("a3b#k@9z");
		int count = 0;

		while(m.find()) {
			System.out.println(m.start()+"..."+m.group());
			count++;
		}
		System.out.println("The total number of mathches are " + count);
	}

}
