package bit701.day0831;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex7_Format {
	public static void main(String[] args) {
		Date date = new Date();
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss EEEE"); // EEE / EEEE 
		System.out.println(dateFormat.format(date));
		
		int money = 4567890;
		NumberFormat numberFormat = NumberFormat.getInstance();
		System.out.println(numberFormat.format(money));
		
		NumberFormat numberFormat2 = NumberFormat.getCurrencyInstance();
		System.out.println(numberFormat2.format(money));

	}
}
