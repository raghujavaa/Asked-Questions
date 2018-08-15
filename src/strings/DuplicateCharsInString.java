package strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharsInString {

	public void findDuplicateChars(String str) {
		Map<Character, Integer> dupMap = new HashMap<>();
		char[] chrs = str.toCharArray();
		for (Character ch : chrs) {
			if (dupMap.containsKey(ch)) {
				dupMap.put(ch, dupMap.get(ch) + 1);
			} else {
				dupMap.put(ch, 1);
			}
		}// for
		Set<Character> keys = dupMap.keySet();
		for (Character ch : keys) {
			if (dupMap.get(ch) > 1) {
				System.out.println(ch + "--->" + dupMap.get(ch));
			}
		}// for
	}// findDuplicateChars()

	public static void main(String[] args) {
		DuplicateCharsInString dcs=new DuplicateCharsInString();
		dcs.findDuplicateChars("Java2Novice");
	}

}// class