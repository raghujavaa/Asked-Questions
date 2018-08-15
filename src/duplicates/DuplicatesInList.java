package duplicates;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class DuplicatesInList {
	public static void main(String[] args) {
		List<String> al = new ArrayList<>();
		al.add("ajay");
		al.add("Becky");
		al.add("Chaitanya");
		al.add("Ajay");
		al.add("Rock");
		al.add("Becky");
		// Displaying ArrayList Elements:
		System.out.println("Before: ");
		System.out.println("ArrayList contains: " + al);

		// Creating LinkedHashSet:
		LinkedHashSet<String> lhs = new LinkedHashSet<>();

		// Adding ArrayList elements to the LinkedHashSet:
		lhs.addAll(al);

		// Removing ArrayList elements:
		al.clear();

		// Adding LinkedHashSet elements to the ArrayList:
		al.addAll(lhs);

		// Displaying ArrayList elements:
		System.out.println("After:");
		System.out.println("ArrayList contains: " + al);

	}// main
}// class
