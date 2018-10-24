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
		System.out.println("調查樣品車時得知");
		System.out.println("車號是"+number+"，汽油量是"+gass);
		
		
	}
}
class Car
{
	int num;
	double gas;
	
	int getnum()
	{
		System.out.println("調查車號");
		return num;
	}
	double getgas()
	{
		System.out.println("調查汽油量");
		return gas;
	}

	void setnumgas(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("將車號設為"+num+"，將汽油量設為"+gas);
	}
	
	
/*	void show()
	{
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
	*/
}