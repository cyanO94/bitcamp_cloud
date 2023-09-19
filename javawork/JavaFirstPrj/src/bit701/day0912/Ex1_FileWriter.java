package bit701.day0912;

import java.io.FileWriter;
import java.io.IOException;

public class Ex1_FileWriter {
	final static String FILENAME = "test.txt ";

	public static void main(String[] args) throws IOException {
		FileWriter fw = null;
		
		fw = new FileWriter(FILENAME);
		fw.write("이름 : ㅇㅅㅇ");
		
	}

}
