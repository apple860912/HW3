import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			
		Car car1;
		car1 = new Car();
		
		
		Car car2;
		car2 = new Car();
		
		car1.num = 1234;
		car1.gas = 20.5;
		
		car2.num = 2345;
		car2.gas = 30.5;
		
		System.out.println("車號是"+car1.num);
		System.out.println("汽油量是"+car1.gas);
		System.out.println("車號是"+car2.num);
		System.out.println("汽油量是"+car2.gas);
	}
}
class Car
{
	int num;
	double gas;
	}