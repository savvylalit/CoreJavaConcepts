package basic;

interface BaseI{
	void method();
}

class BaseC{
	public void method() {
		System.out.println("Inside BaseC::method");
	}
}

public class Bitpuzzle extends BaseC implements BaseI{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mask = 0x000F;
		int value = 0x2222;
		System.out.println(value & mask);
		
		(new Bitpuzzle()).method();
	}

}
