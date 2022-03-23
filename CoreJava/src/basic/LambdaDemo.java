package basic;

public class LambdaDemo {
	
	interface Lamb{
		void var(int x, int y);
	}

	public static void main(String[] args) {
		Lamb lamb = (int x, int y) -> System.out.println(x * y);
		lamb.var(3, 5);
	}

}
/*
-	lambda represents an anonymous function. Also, called as function without a name.
-	It comprises of set of parameters, lambda operator[->] and a function body
-	Lambda expression can have zero or more arguments
()->{System.out.println(“Hello”)}; //Without argument, will print hello
(int a)->{System.out.println(a)}; // One argument, will print value of a
(int a,int b)-> {a+b};//two argument, will return sum of these two integers

-	Lambda expressions can be applied to the abstract method of the functional interface, which is being implemented or being instantiated anonymously.
*/