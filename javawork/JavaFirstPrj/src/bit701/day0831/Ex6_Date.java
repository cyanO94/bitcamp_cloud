package bit701.day0831;

import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class Ex6_Date {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("년, 월, 일을 순서대로 입력해주세요");
		int year = sc.nextInt();
		int month = sc.nextInt();
		int day = sc.nextInt();
		sc.close();
		
		Calendar cal = Calendar.getInstance();
		
		cal.set(year, month - 1, day);
		String week = cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.getDefault());
		System.out.println(week);
	}
}
