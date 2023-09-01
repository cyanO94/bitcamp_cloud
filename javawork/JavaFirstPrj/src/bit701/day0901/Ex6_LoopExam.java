package bit701.day0901;

import java.util.Scanner;

public class Ex6_LoopExam {

	public static void main(String[] args) {
		/*
		 * 구구단을 출력할 시작 단 입력
		 * 구구단을 출력할 끝 단 입력
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("구구단을 출력할 시작 단 입력 : ");
		int ns = Integer.parseInt(sc.nextLine());
		System.out.print("구구단을 출력할 시작 단 입력 : ");
		int ne = Integer.parseInt(sc.nextLine());
		sc.close();
		
		if (ns < 2 || ns > 9) {
			System.out.println("잘못 입력하여 종료합니다");
			return;
		}
		if (ne < 2 || ne > 9) {
			System.out.println("잘못 입력하여 종료합니다");
			return;
		}
		
		if (ns > ne) {
			int tmp = ne;
			ne = ns;
			ns = tmp;
		}
		
		for (int i = ns; i <= ne; i++) {
			System.out.printf("%12s", i + "단");
		}
		System.out.println();
		for (int j = 1; j <= 9; j++) {
			for (int i = ns; i <= ne; i++) {
				System.out.printf("%10s%2d", i + " * " + j + " = ", i*j);
			}
			System.out.println();
		}
		
		
	}

}
