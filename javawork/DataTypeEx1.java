public class DataTypeEx1 {
	public static void main(String[] args) {
		/*
			2023.08.30
			데이터 타입 예제
		*/
		// byte는 8bit 크기의 정수형 타입입니다.
		// 크기는 -128~127의 숫자만 저장이 가능합니다
		byte a = 127;
		System.out.println("a = " + a);

		byte b = (byte)200; // overflow + force type change 
		System.out.println("b = " + b);

		System.out.println(args[0]); // argc check
	}
}