package bit701.day0831;

import java.text.NumberFormat;
import java.util.Scanner;

public class Ex10_Exam {

	public static void main(String[] args) {
		/*
		 * 상품명과 수량, 단가를 각각 입력받은 후 총 금액을 출력하시오.
		 * 그리고 수량이 5개 이상일 경우 10퍼센트 할인된 최종 금액도 출력하시오
		 * 
		 * (예)
		 * 상품명 : 딸기
		 * 수량 : 6
		 * 단가 : 1000
		 * 
		 * 총금액 : 6000원
		 * 5개 이상 10프로 할인된 금액 : 5400원
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("상품명 : ");
		sc.nextLine();
		System.out.print("수량 : ");
		int cnt = Integer.parseInt(sc.nextLine());
		System.out.print("단가 : ");
		int price = Integer.parseInt(sc.nextLine());
		sc.close();
		System.out.println();
		
		NumberFormat numFormat = NumberFormat.getInstance();
		
		System.out.println("총금액 : " + numFormat.format(price* cnt) + "원");
		if (cnt > 4) {
			System.out.println("10프로 할인된 금액 : " + numFormat.format((int)(price * cnt* 0.9)) + "원");
		}
		
		
		
	}

}
