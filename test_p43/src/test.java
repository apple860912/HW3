import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int []test= {80,60,22,50,75};
		
		
		//int res = Integer.parseInt(str);
		
		for(int i=0;i<test.length;i++)
			
			{
			
			System.out.println("第"+(i+1)+"個人的分數是"+test[i]+"分");
			
			}
		System.out.println("考試人數為"+test.length+"人");
	}

}