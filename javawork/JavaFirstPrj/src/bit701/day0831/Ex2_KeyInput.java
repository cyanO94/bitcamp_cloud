package bit701.day0831;

import java.util.Date;
import java.util.Scanner;

public class Ex2_KeyInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Date date = new Date();
		int cur_year = date.getYear();
		
		System.out.println("date.getYear() : " + cur_year);
		
		System.out.print("당신이 태어난 년도는 ? : ");
		int birth_year = Integer.parseInt(sc.nextLine());
		
		System.out.print("당신이 현재 사는 곳은? : ");
		String address = sc.nextLine();
		System.out.println("당신은 " + address + "에 거주하는 " + birth_year + "년생 입니다.");
		sc.close();
		
	}
}
