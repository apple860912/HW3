import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			
		Car car1;
		car1 = new Car();
		car1.setnumgas(1234,20.5);
		car1.show();

		System.out.println("只變更車號");
		car1.setcar(2345);
		car1.show();
		System.out.println("只變更油量");
		car1.setcar(30.5);
		car1.show();
	
	}
}
class Car
{
	private int num;
	private double gas;
	
	

	public void setnumgas(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("將車號設為"+num+"，將汽油量設為"+gas);		
	}
	public void setcar(int n)
	{
		num = n;
		System.out.println("將車號設為"+num);	
	}
	public void setcar(double g)
	{
		gas = g;
		System.out.println("將汽油量設為"+gas);	
	}
	
	
	public void show()
	{
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}

}