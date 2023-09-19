package bit701.day0911;

class Kiwi {
	String name;
	int age;
	
	public Kiwi() {
		this("홍길동", 20);
	}
	
	Kiwi(String name) {
		this(name, 30);
	}
	
	Kiwi(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void writeData() {
		System.out.println("name : " + name + "\tage : " + age);
	}
}

public class Ex13_ConstThis {

	public static void main(String[] args) {
		Kiwi[] karr = {
				new Kiwi(),
				new Kiwi("kim"),
				new Kiwi("Lee", 35)
		};
		
		for (Kiwi k : karr) {
			k.writeData();
		}
	}
}
