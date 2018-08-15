package duplicates;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * We will use Set collection to indentify the duplicate because Set is an unordered list of 
 * distinct elements. 
 * If Set's add () method return false then an element is already exist in a list.
 */
public class DuplicateInArrayExample1 {
	public static void main(String[] args) {
		List<String> elements = new ArrayList<>();
		elements.add("One");
		elements.add("Three");
		elements.add("Two");
		elements.add("Three"); /* Duplicate Element */
		elements.add("Four");
		elements.add("Five");
		elements.add("Four"); /* Duplicate Element */

		System.out.println("Elements : " + elements);

		Set<String> set = new HashSet<>();
		Set<String> duplicateElements = new HashSet<>();

		for (String element : elements) {
			if (!set.add(element)) {
				duplicateElements.add(element);
			}
		}

		System.out.println("Duplicate Elements : " + duplicateElements);
	}
}
