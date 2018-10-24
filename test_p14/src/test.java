import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			
		Car car1;
		car1 = new Car();
		
		car1.setnum(1234);
		car1.setgas (20.5);
		
	//	car1.showcar();
		
	}
}
class Car
{
	int num;
	double gas;

	void setnum(int n)
	{
		num = n;
		System.out.println("將車號設為"+num);
	}
	void setgas(double g)
	{
		gas = g;
		System.out.println("將汽油量設為"+gas);
	}
}