package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// This class implements Comparable. So objects of this class can be sorted on basis of logic on CompareTo.
class Laptop implements Comparable<Laptop>{
	private String brand;
	int ram;
	private int price;
	
	public Laptop(String brand, int ram, int price) {
		this.brand = brand;
		this.ram = ram;
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return String.format("Laptop [brand=%s, ram=%s, price=%s]", brand, ram, price);
	}
	
	// Comparing on basis of Price
	@Override
	public int compareTo(Laptop lap2) {
		if (this.price > lap2.price)
			return 1;
		if(this.price < lap2.price)
			return -1;
		return 0;
	}
	
}

public class ComparableVSComparator {

	public static void main(String[] args) {
		List<Laptop> laps = new ArrayList();
		laps.add(new Laptop("Dell", 16, 800));
		laps.add(new Laptop("Apple", 8, 1200));
		laps.add(new Laptop("Acer", 12, 700));
		
		// Sorting using Comparable. Laptop has implemented compareTo of comparable interface.
		System.out.println("Compare using comparable(default sort for Laptop) on basis of Price");
		Collections.sort(laps);
		laps.forEach(System.out::println);
		
		// Sorting using Comparator in lambda function
		Collections.sort(laps, 
				(Laptop lap1, Laptop lap2) -> {
					if(lap1.ram>lap2.ram)
						return 1;	// If you want to swap value, return 1.
					return -1;
				}
			);
		System.out.println("\nCompare using comparator on basis of RAM size");
		laps.forEach(System.out::println);
	}

}
