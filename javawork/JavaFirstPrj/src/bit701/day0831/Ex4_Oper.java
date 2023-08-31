package bit701.day0831;

import java.util.Scanner;

public class Ex4_Oper {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 : ");
		String str_score = sc.nextLine();
		sc.close();
		int score = Integer.parseInt(str_score);
		if (score < 1 || score > 100) {
			System.out.println("wrong score");
			return;
		}
		
		System.out.println("입력된 점수 : " + score );
		
		String grade = (score >= 90) ? "A" : 
						(score >= 80) ? "B" : 
						(score >= 70) ? "C" : "D";	
//		if (score > 90) {
//			grade = "A";
//		}
//		else if (score > 80) {
//			grade = "B";
//		}
//		else if (score > 80) {
//			grade = "C";
//		}
//		else {
//			grade = "D";
//		}
		
		System.out.println("your grade : " + grade);
		
		
		
	}
}
