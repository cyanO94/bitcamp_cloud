package bit701.day0830;

public class DataEx2 {

	public static void main(String[] args) {
		if (args.length < 3) {
			return;
		}
		System.out.println("내 이름은 " + args[0] + " 입니다.");
		System.out.println("내 집은 " + args[1] + "입니다.");
		System.out.println("내 혈액형은 " + args[2] + "형입니다.");
		System.out.println();
		
		System.out.println("실수형 데이터 타입");
		float f1 = 1234.567891234f; // f를 붙이면 float, 기본 실수형 double
		double d1 = 1234.567891234;
		
		System.out.println("f1 : " + f1);
		System.out.println("d1 : " + d1);
		System.out.println();

		char ch1 = 'A';
		char ch2 = '가';
		System.out.println(ch1);
		System.out.println(ch2);
		
	}

}
