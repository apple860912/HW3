import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.out.println("請輸入一個整數");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
	//	char letter = str.charAt(0);
		
		int num = Integer.parseInt(str);
		
		
			System.out.println("你輸入的數字是:"+num);
		
	}

}