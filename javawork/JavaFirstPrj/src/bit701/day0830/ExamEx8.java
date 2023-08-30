package bit701.day0830;

public class ExamEx8 {

	public static void main(String[] args) {
		// money 변수에 args[0] 값을 대입 후(급여 : 백만단위: 5674321)
		/*
		 * 출력
		 * money : x원
		 * 만원짜리 n 장
		 * 천원짜리 n 장
		 * ...
		 * 산술연산자를 사용해서 출력
		 */
		
		String money = args[0];
		int iMoney = Integer.parseInt(money);
		
		System.out.println("money : " + money + "원");
		System.out.println("만원짜리 " + iMoney / 10000 + "장");
		iMoney = iMoney % 10000;
		System.out.println("천원짜리 " + iMoney / 1000 + "장");
		iMoney = iMoney % 1000;
		System.out.println("백원짜리 " + iMoney / 100 + "장");
		iMoney = iMoney % 100;
		System.out.println("십원짜리 " + iMoney / 10 + "장");
		iMoney = iMoney % 10;
		System.out.println("일원짜리 " + iMoney + "장");

	}

}
