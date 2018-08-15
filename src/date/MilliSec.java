package date;

import java.util.Date;

public class MilliSec {
	public static void main(String[] args) {
		long millis = System.currentTimeMillis();
		Date date = new Date(millis);
		System.out.println(date);
	}
}
