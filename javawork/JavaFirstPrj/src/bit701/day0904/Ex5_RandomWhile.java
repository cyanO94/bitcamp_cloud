package bit701.day0904;

import java.util.Random;
import java.util.Scanner;

public class Ex5_RandomWhile {

	public static void main(String[] args) {
		/*
		 * 1 ~ 100 사이의 난수(n)를 발생 후, 해당 난수 맞추기
		 * 
		 * 입력된 값이 n이면 정답 출력 후 종료.
		 * 숫자 입력 시, n보다 큰지 작은지 출력
		 * 
		 */
		Random r = new Random();
		int tn = r.nextInt(100) + 1;
		Scanner sc = new Scanner(System.in);
		int in;
		int cnt = 1;
		System.out.println(tn);
		while (true) {
			System.out.printf("%d : ", cnt);
			in = Integer.parseInt(sc.nextLine());
			
			if (tn < in) {
				System.out.println(in + " 보다 작습니다.");
			}
			else if (tn > in) {
				System.out.println(in + " 보다 큽니다.");
			}
			else {
				System.out.println("맞습니다");
				break;
			}
			cnt += 1;
		}
		
		System.out.println("시행 횟수 : " + cnt);
		sc.close();
	}

}
