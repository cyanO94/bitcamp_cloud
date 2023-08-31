package bit701.day0831;

import java.util.Scanner;

public class Ex1_KeyInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("당신의 나이를 입력하세요 : ");
		int age = sc.nextInt();
		System.out.println("당신의 나이는 " + age + "입니다.");
		sc.nextLine(); // \n clear
		
		System.out.print("당신의 이름을 입력하세요 : ");
		String name = sc.nextLine();
		System.out.println("당신의 이름은 " + name + "입니다.");
		
	}
}
