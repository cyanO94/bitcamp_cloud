package bit701.day0905;

import java.util.Scanner;

public class ex2_bank {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money = 0; 
		int total = 0;
		boolean exit = false;
		
		while (!exit) {
			System.out.println("=".repeat(30));
			System.out.println("1. 예금, 2. 출금, 3. 잔고, 4. 종료");
			System.out.println("=".repeat(30));
			System.out.print("선택 > ");
			int choice = Integer.parseInt(sc.nextLine());
			
			switch (choice) {
			case 1:
				System.out.println("현재 잔고 : " + total);
				System.out.print("예금할 금액 : ");
				money = Integer.parseInt(sc.nextLine());
				if (money < 0) {
					System.out.println("예금할 금액은 양수여야 함");
					break;
				}
				total += money;
				System.out.println("예금 후 금액 : " + total);	
				break;
			case 2:
				System.out.println("현재 잔고 : " + total);
				System.out.print("출금할 금액 : ");
				money = Integer.parseInt(sc.nextLine());
				if (money < 0 || money > total) {
					System.out.println("출금할 금액은 잔고보다 작고, 음수일 수 없음");
					break;
				}
				total -= money;
				System.out.println("출금 후 금액 : " + total);
				break;
			case 3:
				System.out.println("잔고 : " + total);	
				break;
			case 4:
				exit = true;
				break;
			default:
				System.out.println("잘못된 입력");
				break;
			}
			System.out.println();
		}
		System.out.println("종료");
		sc.close();
		
	}

}
