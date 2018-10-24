import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.println("請輸入五個人的分數");
		
		int test[]= new int[5];
		
		for(int i=0;i<test.length;i++)
		{
			String str = br.readLine();
			test[i]=Integer.parseInt(str);
		}
		
		for(int j=0;j<test.length -1;j++)
		{
			for(int t=j+1;t<test.length;t++)
			{
				if (test[t]>test[j])
				{
					int tmp = test[t];
						test[t]=test[j];
						test[j]=tmp;
				}			
			}
		}
		
		for(int i=0;i<test.length;i++)
			
		{
		
			System.out.println("第"+(i+1)+"名的分數是"+test[i]+"分");
		
		}

		
	}

}