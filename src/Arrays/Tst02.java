package Arrays;

public class Tst02 {
	public static void main(String[] args) {
		for (String arg : args) {
			try {
				char[] tmp = new char[Integer.valueOf(arg)];
				System.out.println("Allocated array of size: " + arg);
				tmp = null;
			} catch (Throwable t) {
				System.out.println("Couldn’t allocate array of size: " + arg);
			}
		}
	}
}
