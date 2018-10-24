import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.io.IOException;

public class test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int [] test = (int [])Array.newInstance(int.class,3);
		test=new int[5];
		
		Array.set(test, 0, 123);
		Array.set(test, 1, 456);
		Array.set(test, 2, 789);
		
		//int res = Integer.parseInt(str);
		
		for(int i=0;i<3;i++)
			
			{
			
			System.out.println("test["+i+"]="+Array.get(test,i ));
			
			}
	}

}