package basic;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {  
        String[] words = new String[10];  
        Optional<String> checkNull = 
                      Optional.ofNullable(words[5]);  
        if (checkNull.isPresent()) {  
            String word = words[5].toLowerCase();  
            System.out.print(word);  
        } else  
            System.out.println("word is null");  
    }  
}

/*
-	Optional class can help us avoid abnormal termination from NullPointerException.
-	By using optional we can specify alternate value or use or alternate flow of code.
-	You can write a neat and more readable code without many null checks
-	To use Optional, import java.util package
*/
