package Basic;

public class OverridingTest {

	public static void main(String[] args) {

		Car car = new Car();
		System.out.println(car.fuel());
		
		Bus bus = new Bus();
		System.out.println(bus.fuel());

	}

}
