package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.PrimitiveIterator.OfDouble;

class Container<T>	// Here T is Type. it can be any datatype.
{
	T value;		// Here value will be of type T
	
	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public void show() {
		System.out.println("Type of Container : "+value.getClass().getName());
		System.out.println("Value of Double Container : "+ value);
	}
}

// In below class, you are restricting the generic to number. The generic type should be child of Number.
class ContainerRestrict<T extends Number>{
	T value;
	
	void show(){
		System.out.println("Type of ContainerRestrict : "+value.getClass().getName());
		System.out.println("Value of Integer ContainerRestrict : "+ value);
	}
	
	// Allow parameters that are subclass of T.
	void showArrayListExtend(ArrayList<? extends T> arr) {
		
	}
	
	// Allow parameters that are superclass of T. 
	void showArrayListSuper(ArrayList<? super T> arr) {
		
	}
}


public class GenericsDemo {

	public static void main(String[] args) {
		Container<Double> obj = new Container();
		obj.value = 9.0;
		obj.show();
		
		ContainerRestrict<Integer> objContRest = new ContainerRestrict();
		objContRest.value = 5;
		objContRest.show();
		objContRest.showArrayListExtend(new ArrayList<Integer>());
		objContRest.showArrayListSuper(new ArrayList<Number>());
	}
}

/*
 * Generic only supports class. So primitive datatypes will not work*/
