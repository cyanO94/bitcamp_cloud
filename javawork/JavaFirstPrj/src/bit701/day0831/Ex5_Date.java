package bit701.day0831;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Ex5_Date {
	public static void main(String[] args) {
		Date date = new Date();
		int year = date.getYear() + 1900;
		int month = date.getMonth() + 1;
		int day = date.getDate();
		
		int hh = date.getHours();
		int mm = date.getMinutes();
		int ss = date.getSeconds();
		
		System.out.printf("현재 년월일 : %4d-%02d-%02d\n", year, month, day);
		
		Calendar cal = Calendar.getInstance();
		year = cal.get(Calendar.YEAR);
		String sMonth = cal.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.getDefault());//cal.get(Calendar.MONTH) + 1;
		day = cal.get(Calendar.DATE);
		
		System.out.printf("현재 년월일 : %4d-%s-%02d\n", year, sMonth, day);
		String week = cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.getDefault());
		System.out.println(week);
	}
}
