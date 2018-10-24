import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String str = "HELLO";
		
		char ch1= str.charAt(0);
		char ch2= str.charAt(1);
		int len = str.length();
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
//		String str = br.readLine();
	//	char letter = str.charAt(0);
		
	//	int num = Integer.parseInt(str);
		
		
			System.out.println(str+"的第一個字元是"+ch1);
			System.out.println(str+"的第一個字元是"+ch2);
			System.out.println(str+"的長度是"+len);
		
	}

}