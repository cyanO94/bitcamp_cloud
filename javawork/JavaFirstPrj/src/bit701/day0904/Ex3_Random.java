package bit701.day0904;

public class Ex3_Random {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			double r = Math.random();
			System.out.println(r);
		}
		System.out.println("=".repeat(30));
		
		for (int i = 0; i < 5; i++) {
			int r = (int)(Math.random()*10)+1;
			System.out.println(r);
		}
		System.out.println("=".repeat(30));
		
		
		for (int i = 0; i < 5; i++) {
			int r = (int)(Math.random()*26) + 'A';
			System.out.println((char)r);
		}
		System.out.println("=".repeat(30));
		
		for (int i = 0; i < 5; i++) {
			int r = (int)(Math.random()*26) + 'a';
			System.out.println((char)r);
		}
		System.out.println("=".repeat(30));
		
	}

}
