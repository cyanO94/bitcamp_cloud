package bit701.day0907;

import java.util.Random;

public class Ex3_ArrayBinggo {

	public static void main(String[] args) {
		int[][] pan = new int[3][3];
		Random r = new Random();
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				pan[i][j] = r.nextInt(3) + 1;
			}	
		}
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(pan[i][j] + " ");
			}	
			System.out.println();
		}
		
		int cnt = 0;
		for (int i = 0; i < 3; i++) {
			if (pan[i][0] == pan[i][1] && pan[i][0] == pan[i][2]) {
				cnt += 1;
			}
			if (pan[0][i] == pan[1][i] && pan[1][i] == pan[2][i]) {
				cnt += 1;
			}	
		}
		
		if (pan[0][0] == pan[1][1] && pan[1][1] == pan[2][2]) cnt += 1;
		if (pan[0][2] == pan[1][1] && pan[1][1] == pan[2][0]) cnt += 1;
		
		
		if (cnt == 0) {
			System.out.println("꽝");
		}
		else {
			System.out.println("빙고 : " + cnt + "개");
		}
		
	}

}
