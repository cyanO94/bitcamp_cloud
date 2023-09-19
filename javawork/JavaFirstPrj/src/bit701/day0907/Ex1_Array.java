package bit701.day0907;

import java.util.Scanner;

public class Ex1_Array {

	public static void main(String[] args) {
		System.out.println("배열 복습 예제");
		
		/*
		 * 인원 수를 입력받는다.
		 * 인원 수만큼 names, kor, eng를 배열 할당한다
		 * 인원수만큼 이름, 국어점수, 영어점수를 입력하면
		 * 
		 * 아래와 같이 출력되도록 프로그램 작성
		 * 
		 * 번호 이름 국어 영어 총점 평균
		 * -----------------------
		 * 1   김   1  1   2   1
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 입력 : ");
		int cnt = Integer.parseInt(sc.nextLine());
		
		String names[] = new String[cnt];
		int kor_list[] = new int[cnt];
		int eng_list[] = new int[cnt];
		
		for (int i = 0; i < cnt; i++) {
			System.out.print( (i +1) + "번째 사람 이름 : ");
			names[i] = sc.nextLine();
			
			System.out.print( (i +1) + "번째 사람 국어 점수 : ");
			kor_list[i] = Integer.parseInt(sc.nextLine());
			
			System.out.print( (i +1) + "번째 사람 영어 점수 : ");
			eng_list[i] = Integer.parseInt(sc.nextLine());
		}
		

		System.out.printf("%5s%5s%5s%5s%5s%5s\n", "번호", "이름", "국어", "영어", "총점", "평균");
		System.out.println("-".repeat(30));
		for (int i = 0; i < cnt; i++) {
			System.out.printf("%5d%5s%5d%5d%5d%5.1f\n", i+1, names[i], kor_list[i], eng_list[i], kor_list[i]+eng_list[i], (kor_list[i] + eng_list[i])/2.0);
		}
		
		
		
		sc.close();
		
	}

}
