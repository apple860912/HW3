import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			
		Car car1;
		car1 = new Car();
		
		int num=1234;
		double gas=20.5;
		
		car1.setnumgas(num, gas);
		
	}
}
class Car
{
	int num;
	double gas;

	void setnumgas(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("�N�����]��"+num+"�A�N�T�o�q�]��"+gas);
	}
	void show()
	{
		System.out.println("�����O"+num);
		System.out.println("�T�o�q�O"+gas);
	}
}