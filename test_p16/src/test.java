import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			
		System.out.println("�п�Ja or b");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		char letter = str.charAt(0);
		
	//	int num = Integer.parseInt(br.readLine());
		
		switch (letter)
		{
		case 'a':
		{
			System.out.println("��J���Oa");
			break;
		}
		case 'b':
		{
			System.out.println("��J���Ob");
			break;
		}	
		default:
		{
			System.out.println("�п�Ja��b");
			break;
		}
		}
		
	}

}