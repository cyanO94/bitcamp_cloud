public class ArgsArray {
	public static void main(String[] args) {

		if (args.length > 1) {
			String str1 = args[0];
			String str2 = args[1];
			System.out.println("str1 = " + str1);
			System.out.println("str2 = " + str2);
			System.out.println("두 수의 합 = " + str1 + str2); // string int operator+

			int istr1 = Integer.parseInt(str1);
			int istr2 = Integer.parseInt(str2);
			System.out.println("두 수의 합 = " + (istr1 + istr2));
		}
		else {
			System.out.println("args.length <= 1");
		}

		
	}
}