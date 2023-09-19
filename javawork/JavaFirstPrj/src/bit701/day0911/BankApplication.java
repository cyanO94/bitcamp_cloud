package bit701.day0911;

import java.util.Scanner;

class Account {
	private String accountNum;
	private String owner;
	private int money;
	final static int MAX_ACCOUNT_SIZE = 2;
	
	Account(String accountNum, String owner, int money) {
		this.accountNum = accountNum;
		this.money = money;
		this.owner = owner;
	}
	
	boolean findAccountByNum(String accountNum) {
		return this.accountNum.equals(accountNum);
	}
	
	void deposit(int money) {
		if (money < 0)  {
			System.out.println("예금은 양수 금액만 가능합니다.");
			return;
		}
		this.money += money;
	}
	
	void withdraw(int money) {
		if (money > this.money || money < 0)  {
			System.out.println("출금은 예금액 범위를 벗어날 수 없습니다.");
			return;
		}
		this.money -= money;
	}
	
	
	
	public String toString() {
		return String.format("%s\t%s\t%d", accountNum, owner, money);
	}
}

public class BankApplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money = 0; 
		int total = 0;
		boolean exit = false;
		
		String tmp_num;
		int tmp_money;
		Account tmp_account;
		int index = 0;
		
		Account accounts[] = new Account[Account.MAX_ACCOUNT_SIZE];
		
		while (!exit) {
			System.out.println("=".repeat(50));
			System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println("=".repeat(50));
			System.out.print("선택 > ");
			int choice = Integer.parseInt(sc.nextLine());
			
			switch (choice) {
			case 1:
				System.out.println("-".repeat(20));
				System.out.println("계좌 생성");
				System.out.println("-".repeat(20));
				
				if (Account.MAX_ACCOUNT_SIZE <= index) {
					System.out.println("계좌가 너무 많습니다");
					break;
				}
				
				System.out.print("계좌 번호 : ");
				tmp_num = sc.nextLine();
				System.out.print("계좌주 : ");
				String tmp_name = sc.nextLine();
				System.out.print("초기입금액 : ");
				tmp_money = Integer.parseInt(sc.nextLine());
				
				
				tmp_account = null;
				for (Account account: accounts) {
					if (account == null) break;

					if (account.findAccountByNum(tmp_num)) {
						tmp_account = account;
						break;
					}
				}
				
				if (tmp_account != null) {
					System.out.println("계좌 번호 중복");
					break;
				}

				accounts[index] = new Account(tmp_num, tmp_name, tmp_money);
				index += 1;
				System.out.println("결과 : 계좌가 생성되었습니다");	
				break;
			case 2:
				System.out.println("-".repeat(20));
				System.out.println("계좌 목록");
				System.out.println("-".repeat(20));
				
				for (Account account: accounts) {
					if (account == null) break;
					System.out.println(account.toString());
				}
				break;
			case 3:
				System.out.println("-".repeat(20));
				System.out.println("예금");
				System.out.println("-".repeat(20));
				System.out.print("계좌 번호 : ");
				tmp_num = sc.nextLine();
				System.out.print("예금액 : ");
				tmp_money = Integer.parseInt(sc.nextLine());
				
				tmp_account = null;
				for (Account account: accounts) {
					if (account == null) break;

					if (account.findAccountByNum(tmp_num)) {
						tmp_account = account;
						break;
					}
				}
				
				if (tmp_account == null) {
					System.out.println("맞는 계좌가 없습니다.");
					break;
				}
				
				tmp_account.deposit(tmp_money);
				break;
			case 4:
				System.out.println("-".repeat(20));
				System.out.println("출금");
				System.out.println("-".repeat(20));
				System.out.print("계좌 번호 : ");
				tmp_num = sc.nextLine();
				System.out.print("출금액 : ");
				tmp_money = Integer.parseInt(sc.nextLine());
				
				tmp_account = null;
				for (Account account: accounts) {
					if (account == null) break;

					if (account.findAccountByNum(tmp_num)) {
						tmp_account = account;
						break;
					}
				}
				
				if (tmp_account == null) {
					System.out.println("맞는 계좌가 없습니다.");
					break;
				}
				
				tmp_account.withdraw(tmp_money);
				break;
			case 5:
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
