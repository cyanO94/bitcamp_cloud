package bit701.day0904;

import java.util.Random;

public class Ex4_Random {

	public static void main(String[] args) {
		Random r = new Random();
		
		for (int i = 0; i < 5; i++) {
			int n = r.nextInt();
			System.out.println(n);
		}
		System.out.println("=".repeat(30));
		
		for (int i = 0; i < 5; i++) {
			int n = r.nextInt(100) + 1;
			System.out.println(n);
		}
		System.out.println("=".repeat(30));
		
		for (int i = 0; i < 5; i++) {
			int n = r.nextInt(26) + 'A';
			System.out.println((char)n);
		}
		System.out.println("=".repeat(30));
		
		for (int i = 0; i < 5; i++) {
			int n = r.nextInt(26) + 'a';
			System.out.println((char)n);
		}
		System.out.println("=".repeat(30));
		
		
		
		
	}

}
