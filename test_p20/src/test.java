import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			
		Car car1;
		car1 = new Car();
		
		car1.num = 1234;
		car1.gas = -10;
		
		car1.show();
	}
}
class Car
{
	int num;
	double gas;

	void show()
	{
		System.out.println("車號是"+this.num);
		System.out.println("汽油量是"+this.gas);
	}
}