package bit701.day0830;

public class AsciiEx3 {
	
	public static void main(String[] args) {
		char a = 65; // char <- num : ascii
		int b = 'B';
		System.out.println(a + " " + (int)a);
		System.out.println((char)b + " " + b);
	
		char c = 'C';
		int d = 68;
		
		System.out.println(c + 1);	// 묵시적 형변환 char + int => int
		System.out.println(c + '1'); // 0x43 + 0x31
		
		System.out.println((double)(5/2));// (int/int) => int => dobule 
		System.out.println((double)5/2);  // dobule/int
	}
}
