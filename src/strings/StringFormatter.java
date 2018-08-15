package strings;

public class StringFormatter {
	public static String reverseString(String str) {
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		return sb.toString();
	}

	public static String revString(String str1) {
		StringBuffer sb2 = new StringBuffer(str1);
		sb2.reverse();
		return sb2.toString();
	}

}
