import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			
		Car car1;
		car1 = new Car();
		car1.setnumgas(1234,20.5);
		int number=car1.getnum();
		double gass=car1.getgas();
		System.out.println("�լd�˫~���ɱo��");
		System.out.println("�����O"+number+"�A�T�o�q�O"+gass);
		
		
	}
}
class Car
{
	int num;
	double gas;
	
	int getnum()
	{
		System.out.println("�լd����");
		return num;
	}
	double getgas()
	{
		System.out.println("�լd�T�o�q");
		return gas;
	}

	void setnumgas(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("�N�����]��"+num+"�A�N�T�o�q�]��"+gas);
	}
	
	
/*	void show()
	{
		System.out.println("�����O"+num);
		System.out.println("�T�o�q�O"+gas);
	}
	*/
}