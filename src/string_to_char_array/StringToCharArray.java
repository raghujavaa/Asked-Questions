package string_to_char_array;

//Java program to demonstrate
//working of toCharArray() method

class StringToCharArray {
	public static void main(String args[]) {
		String s = "GeeksforGeeks";
		char[] gfg = s.toCharArray();
		for (int i = 0; i < gfg.length; i++) {
			System.out.println(gfg[i]);
		}
	}
}

/*
 * java string toCharArray() method converts the given string into a sequence of
 * characters. The returned array length is equal to the length of the string.
 */