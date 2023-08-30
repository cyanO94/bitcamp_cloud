package bit701.day0830;

public class OperEx5 {

	public static void main(String[] args) {
		// 증감연산자 : ++, --
		// 변수 앞에 붙일 경우, 뒤에 붙일 경우 우선순위 바뀜
		// 단항으로 사용 추천
		
		int a = 5;
		int b = 5;
		
		++a;
		b++;
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(++a);
		System.out.println(b++);
		System.out.println("a = " + a + ", b = " + b);
		
		a = b = 5;
		int m = ++a;
		int n = b++;
		System.out.println(a);
		System.out.println(b);
		System.out.println(m);
		System.out.println(n);
		
	}

}
