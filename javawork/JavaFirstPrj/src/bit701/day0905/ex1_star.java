package bit701.day0905;

public class ex1_star {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == j) System.out.print(i+1);
				else System.out.print("*");
			}
			System.out.println();
		}
	}

}
