package bit701.day0919;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Ex3_ {

	public static void main(String[] args) {
		try {
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("local IP Address : " + local.getHostAddress());
			System.out.println("local computer name : " + local.getHostName() );
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			InetAddress[] naverArr = InetAddress.getAllByName("www.naver.com");
			for(InetAddress inet: naverArr) {
				System.out.println("naver ip : " + inet.getHostAddress() );
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
