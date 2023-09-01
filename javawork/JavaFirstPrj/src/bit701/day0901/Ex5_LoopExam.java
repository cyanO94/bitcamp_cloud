package bit701.day0901;

import java.util.Scanner;

public class Ex5_LoopExam {

	public static void main(String[] args) {
		/*
		 * 1. 숫자 n을 입력 받은 후 1부터 n까지의 총 합계를 출력하시오.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1~n의 합 출력 // n : ");
		int n = Integer.parseInt(sc.nextLine());
		
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println("합 : " + sum);
		
		/*
		 * 2. 구구단 숫자 2~9 사이의 숫자를 입력 받은 후 범위를 벗어날 경우
		 * "잘 못 입력하여 종료합니다" 라고 출력 후 종료
		 * 제대로 입력 시 해당 구구단 출력
		 */
		System.out.print("구구단 n 단 출력 // n (2~9): ");
		n = Integer.parseInt(sc.nextLine());
		sc.close();
		if (n < 2 || n > 9) {
			System.out.println("잘못 입력하여 종료합니다");
			return;
		}
		
		for (int i = 1; i <= 9; i++) {
			System.out.println(n + " * " + i + " = " + n*i);
		}
		
		
	}

}
